use std::fmt;
use rand::{
    distributions::{Distribution, Standard},
    Rng
};

/// Represents a monetary amount in euros and cents.
#[derive(Debug)]
struct Amount {
    euros: u32,
    cents: u32, 
}

// Custom Display trait implementation for Amount
impl fmt::Display for Amount {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "{}.{:02} \u{20AC}", self.euros, self.cents)
    }
}

impl Amount {
    /// Makes a new amount from cents
    fn new(cents: u32) -> Self {
        Amount {
            euros: cents / 100,
            cents: cents % 100
        }
    }
    
    /// Gets the amount as cents
    fn as_cents(&self) -> u32 {
        self.euros * 100 + self.cents
    }
}

/// Euro coins
enum Coin {
    Cent1,
    Cent2,
    Cent5,
    Cent10,
    Cent20,
    Cent50,
    Eur1,
    Eur2,
}

impl Distribution<Coin> for Standard {
    fn sample<R: Rng + ?Sized>(&self, rng: &mut R) -> Coin {
        match rng.gen_range(0..=7) {
            0 => Coin::Cent1,
            1 => Coin::Cent2,
            2 => Coin::Cent5,
            3 => Coin::Cent10,
            4 => Coin::Cent20,
            5 => Coin::Cent50,
            6 => Coin::Eur1,
            _ => Coin::Eur2
        }
    }
}

impl Coin {
    /// Gets the monetary value of this coin in cents.
    fn value_in_cents(&self) -> u32 {
        match self {
            Coin::Cent1 => 1,
            Coin::Cent2 => 2,
            Coin::Cent5 => 5,
            Coin::Cent10 => 10,
            Coin::Cent20 => 20,
            Coin::Cent50 => 50,
            Coin::Eur1 => 100,
            Coin::Eur2 => 200 
        }    
    }

    fn weight_in_grams(&self) -> f32 {
        match self {
            Coin::Cent1 => 2.30,
            Coin::Cent2 => 3.06,
            Coin::Cent5 => 3.92,
            Coin::Cent10 => 4.10,
            Coin::Cent20 => 5.74,
            Coin::Cent50 => 7.80,
            Coin::Eur1 => 7.50,
            Coin::Eur2 => 8.50 
        }    
    }
}

struct Machine {
    name: String,
    weight: f32,
    coins: Vec<Coin>
}

impl Machine {
    fn new(name: &str, weight: f32) -> Self {
        Self {name: String::from(name), weight, coins: Vec::new()}
    }

    fn insert_coin(&mut self, coin: Coin) {
        self.coins.push(coin);
    }

    fn total_coin_weight(&self) -> f32 {
        let mut sum_weight = 0.0;
        for coin in &self.coins {
            sum_weight += coin.weight_in_grams();
        }
        
        sum_weight / 1000.0 // convert to kg
    }

    fn total_weight(&self) -> f32 {
        self.weight + self.total_coin_weight()
    }

    fn coin_count(&self) -> usize {
        self.coins.len()
    }

    fn total_amount(&self) -> Amount {
        let mut sum_cents = 0;
        for coin in &self.coins {
            sum_cents += coin.value_in_cents();
        }

        Amount::new(sum_cents)
    }

    fn empty(&mut self) {
        self.coins.clear();
    }
}

fn main() {
    // Create machine, has to be mutable to be able to add to coins vector
    let mut machine = Machine::new("CoinMaster 3000", 274.8);

    println!("Inserting 500 random coins into {}...", machine.name); 
    while machine.coin_count() < 500 {
        machine.insert_coin(rand::random());
    }

    println!("Coin count: {}", machine.coin_count());
    println!("Total amount: {}", machine.total_amount());
    println!("Total coin weight: {:.2} kg", machine.total_coin_weight());
    println!("Total machine weight: {:.2} kg", machine.total_weight());

    println!("\nEmptying {}...", machine.name);
    machine.empty();
    println!("Coin count after emptying: {}", machine.coin_count());
    println!("Total amount after emptying: {}", machine.total_amount());
    println!("Total coin weight after emptying: {:.2} kg", machine.total_coin_weight());
    println!("Total machine weight after emptying: {:.2} kg", machine.total_weight());
}
use std::fmt;

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

fn main() {
    // Make an array of coins
    let my_coins = [Coin::Cent50, Coin::Cent20, Coin::Eur1];

    // Sum up the weights of the coins
    let mut sum_weight = 0.0;
    for coin in my_coins.iter() {
        sum_weight += coin.weight_in_grams();
    }

    println!("Total weight = {} g", sum_weight);
}
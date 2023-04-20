use std::fmt;

// Deriving Debug and Default for Amount in one line
#[derive(Debug, Default)]
/// Represents a monetary amount in euros and cents.
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

// Implementing Default for Amount, more verbose
// impl Default for Amount {
//     fn default() -> Self {
//         Self {
//             euros: 0,
//             cents: 0
//         }
//     }
// }

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
}

fn main() {
    let default_amount = Amount::default();
    println!("{}", default_amount);
}
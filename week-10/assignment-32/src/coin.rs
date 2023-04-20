pub mod models;
use models::Coin;

impl Coin {
  /// Gets the monetary value of this coin in cents.
  pub fn value_in_cents(&self) -> u32 {
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


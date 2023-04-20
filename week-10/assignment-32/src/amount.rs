use std::fmt;
use std::error::Error;
    
pub mod models;
mod tests;

use models::*;

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
    pub fn new(cents: u32) -> Self {
        Amount {
            euros: cents / 100,
            cents: cents % 100
        }
    }

    pub fn new_from(euros: u32, cents: u32) -> Result<Amount, AmountError> {
        match cents {
            0..=99 => Ok(Amount{euros, cents}),
            _ => Err(AmountError::new("Cents must be greater than 0 and less than 100!"))
        }
    }
    
    /// Gets the amount as cents
    pub fn as_cents(&self) -> u32 {
        self.euros * 100 + self.cents
    }

    pub fn increment(&mut self) {
        if self.cents >= 99 {
            self.cents = 0;
            self.euros += 1;
        } else {
            self.cents += 1;
        }
    }

    pub fn decrement(&mut self) {
        if self.cents <= 0 {
            self.cents = 99;
            self.euros -= 1;
        } else {
            self.cents -= 1;
        }
    }
}

impl fmt::Display for AmountError {
  fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
      write!(f, "ERROR: {}", self.message)
  }
}

impl Error for AmountError {
  fn description(&self) -> &str {
      &self.message
  }
}

impl AmountError {
  pub fn new(msg: &str) -> Self {
      Self {message: msg.to_string()}
  }
}



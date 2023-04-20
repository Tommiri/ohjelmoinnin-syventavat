mod amount;
mod coin;

use amount::models::*;

fn main() {
    let bad_amount = Amount::new_from(3, 50);

    match bad_amount {
        Ok(amount) => println!("Valid amount: {}", amount),
        Err(error) => println!("Invalid amount: {}", error)
    }
}
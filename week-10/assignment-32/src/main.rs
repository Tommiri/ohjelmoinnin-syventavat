mod amount;
mod coin;

use amount::models::*;

fn main() {
    let mut money = Amount::new(401);
    money.decrement();

    println!("{}", money);
}
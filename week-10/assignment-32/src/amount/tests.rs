#[cfg(test)]
use super::*;

#[test]
fn test_increment() {
  let mut amount = Amount::new(498);
  amount.increment();
  assert_eq!(amount.euros, 4);
  assert_eq!(amount.cents, 99);

  amount.increment();
  assert_eq!(amount.euros, 5);
  assert_eq!(amount.cents, 0);
}

#[test]
fn test_decrement() {
  let mut amount = Amount::new(501);
  amount.decrement();
  assert_eq!(amount.euros, 5);
  assert_eq!(amount.cents, 0);

  amount.decrement();
  assert_eq!(amount.euros, 4);
  assert_eq!(amount.cents, 99);
}
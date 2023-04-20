#[derive(Debug, Default)]
/// Represents a monetary amount in euros and cents.
pub struct Amount {
    pub euros: u32,
    pub cents: u32, 
}

#[derive(Debug)]
pub struct AmountError {
    pub message: String
}
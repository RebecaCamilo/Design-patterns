# Strategy
The Strategy design pattern is a behavioral pattern that defines a family of algorithms, encapsulates each of them, and 
makes them interchangeable. It allows the client to choose an algorithm from a family of algorithms and use it 
seamlessly, without altering the client class.

With it, we can avoid duplicated code and eliminate multiple conditional blocks in the code to handle different 
behaviors, providing a more flexible way of extension.

## Payment System using Strategy

The API utilizes the Strategy pattern to manage different payment strategies. Each strategy is encapsulated in a
specific class (`Cash, CreditCard, DebitCard`) that implements the `PayStrategy` interface.
By using this approach, the client doesn't need to worry about the internal details of each payment strategy. Instead,
it simply calls the `pay()` method of the current strategy, allowing for easy substitution and extension of strategies.

This structure facilitates the addition of new payment methods in the future without modifying the existing code.
Furthermore, it provides an organized and modular way to handle the diversity of payment strategies in a system.

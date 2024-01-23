/*
O Chain of Responsibility é um padrão de projeto comportamental que
permite que você passe pedidos por uma corrente de handlers.
Podemos dizer que normalmente cada receptor contém referência de outro
receptor. Se um objeto não puder lidar com a solicitação, ele passará
o mesmo para o próximo receptor e assim por diante.
*/

# Chain of Responsibility
The Chain of Responsibility design pattern is a behavioral pattern that passes a request along a chain of handlers. Each 
handler decides either to process the request or to pass it to the next handler in the chain. This pattern promotes 
loose coupling, allowing multiple objects to handle a request without the sender needing to know which object will 
ultimately process it.

By employing the Chain of Responsibility pattern, the project achieves several advantages:
- Flexibility: The order and presence of handlers can be easily adjusted without modifying the client code.
- Scalability: New verification criteria can be introduced by adding new handlers to the chain, ensuring easy extension.
- Maintainability: The modular structure promotes maintainability, as each handler focuses on a specific responsibility.

This design allows for a dynamic and extensible system that can adapt to evolving requirements without requiring 
extensive modifications.

## Account Closure System using Chain of Responsibility

In the presented project, the Chain of Responsibility pattern is applied to create a system for closing bank accounts. 
The main objective is to establish a series of responsibilities, each encapsulated in a separate handler, that 
collectively verify specific conditions before allowing an account to be closed.

The chain is composed of three handlers: `VerifyNumberHandle`, `VerifyOwnerHandle` and `VerifyAccountBalanceHandle`;
Which implement the `HandlePayments` interface, that defines a common method `handlePaymentsBase()`.

The `DriverChainOfResponsibility` class serves as the entry point for the demonstration. It creates instances of the
`Account` class representing different scenarios. The `chainOfHandlesPayments()` method initializes the chain of 
responsibility by linking the handlers in the desired order. The `closeAccount()` method then uses this chain to 
attempt to close the accounts, showcasing the effectiveness of the Chain of Responsibility in handling different closure 
conditions.


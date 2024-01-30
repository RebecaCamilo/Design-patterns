# Decorator 
The Decorator Pattern is a structural design pattern that allows behavior to be added to an individual object, either 
statically or dynamically, without affecting the behavior of other objects from the same class. It is achieved by 
creating a set of decorator classes that are used to wrap concrete components.

## SorveteDecorator Implementation
In the provided Java project, the SorveteDecorator classes exemplify the Decorator Pattern in the context of a simple 
ice cream (sorvete) ordering system. Here's a summary of the implementation:

- `Sorvete`: Component Interface. The base interface or abstract class that defines the methods to be implemented by 
concrete components.

- `SorveteSimples`: Concrete Component. The basic implementation of the Sorvete interface, representing the core ice cream.

- `ComCalda`, `ComGotasDeChocolate`: Decorator Classes. The decorator classes that extend the SorveteDecorator base class. 
They add additional behavior to the base component (Sorvete). Each decorator class contains a reference to the wrapped 
component.

- `DriverDecorator`: The main class where the Decorator Pattern is demonstrated. It creates a base ice cream (SorveteSimples) 
and then decorates it with additional features using decorator classes (ComCalda, ComGotasDeChocolate).

This example demonstrates how the Decorator Pattern allows you to dynamically add features (`calda`, `gotas de chocolate`) 
to the base ice cream (`SorveteSimples`) without modifying its code. Each decorator class adds its own behavior, and the 
combination of decorators provides a flexible and extensible way to enhance the functionality of the core component.

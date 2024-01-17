# Factory Method
The Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, 
but allows subclasses to alter the type of objects that will be created. This pattern promotes flexibility and extensibility, 
allowing a class to delegate the instantiation process to its subclasses.

In summary, the Factory Method is useful whenever there is a need to delegate the responsibility for object creation to 
subclasses, providing greater flexibility, decoupling, and support for extensibility in the system design.

## Logistics System using Factory Method
This Logistics System implements the Factory Method design pattern to provide a flexible way of creating instances of 
the `Logistics` abstract class. When instantiating a variable of type `Logistics`, the behavior varies depending on whether it's created through `new RoadLogistics()` or `new SeaLogistics()`.

This design allows for a unified interface (`abstract class Logistics`) while enabling subclasses to define and 
implement their specific logistics processes. It enhances flexibility, facilitating the integration of different 
logistics strategies within the same system.

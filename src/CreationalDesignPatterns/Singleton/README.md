# Singleton
The Singleton Pattern is a creational design pattern that ensures a class has only one instance and provides a global 
point of access to that instance. This pattern is particularly useful when there's a need for a single point of control 
or coordination, such as managing a configuration, logging, or a shared resource.

In summary, the Singleton Pattern is beneficial when should be only one instance of a class that could be accessible 
from anywhere in the application and a global point of control or coordination is required. This pattern is a valuable 
tool for managing shared resources, enforcing single points of control, and providing a global instance accessible 
throughout the application.

## Database Singleton Implementation
In the provided Java project, the `DatabaseSingleton` class exemplifies the Singleton Pattern. Here's a summary of the 
implementation:
- Static Instance: The class contains a static instance variable (instance) to hold the single instance of the class.
- Private Constructor: The constructor of the class is private, preventing the creation of multiple instances from 
outside the class.
- getInstance Method: The public static method `getInstance` is responsible for returning the single instance of the 
class. If the instance doesn't exist, it creates one; otherwise, it returns the existing instance.
- Shared Resource: The class manages a shared resource (users list) that can be accessed and modified through public 
methods (`add`, `remove`, `show`).

In the `DriverSingleton` class, two instances of `DatabaseSingleton` are created using the getInstance method. Both 
instances share the same underlying data structure (users list). The example demonstrates how changes made through 
one instance are reflected in the other, highlighting the single point of control provided by the Singleton Pattern.

# DesignPatterns

What is design pattern?
- A general reusable solution provided for common problem within a context in software development.
- A design pattern is a general repeatable solution to a commonly occurring problem in software design.
- A design pattern isn't a finished design that can be transformed directly into code. 
- It is a description or template for how to solve a problem that can be used in many different situations.

Advantages of practicing design pattern
- Imroves software development process
- It gives the developer a selection of tried and tested solution
- Supports reusability and extensibility
- Provides transperancy to the design of an application

# Type of Design Patterns
1. Creational
2. Structural
3. Behavioural


 Creational Pattern
 - Creational pattern aims to separate a system from how its objects are created, composed and represented.

 Purpose of Creational Pattern
 - Generic instantiation
 - Simplicity
 - Creation constraints
 
 Structural Pattern
 - These patterns are used to ease the development by identifying a simple way to realize relationship between the entities.
 
 Purpose of Structural Pattern
 - Performance
 - Refactoring
 - Memory Utilization
 
 Behavioral Pattern
 - These design patterns are used to provide solution for the better interaction between objects and how to provide the loose coupling and flexibility to extend easily. 
 
 
# 1. Creational Design Pattern
- Facotry Pattern
- Abstract Factory Pattern
- Builder Pattern
- Prototype Pattern
- Singleton Pattern

# 2. Structural Design Pattern
- Adapter Pattern
- Bridge Pattern
- Composite Pattern
- Decorator Pattern
- Facade pattern
- Flyweight Pattern
- Proxy Pattern

# 3. Behavioral Design Pattern
- Command Pattern
- ....
- ...
- ..


# Factory Pattern (Creational Design Pattern)
- The factory design pattern is used to define an interface for creating an object, and let sub classes decide whic class to instantiate. 

When to use Factory Pattern
- Whenever we have a super class and n sub-classes and based on data provided if we have to return the object of an one of the sub classes.
- At the run time we need to get an object of similar type based on type of parameter value passed
- Whenever object creation code is spread across the entire appliation, and if we need to change the process of object creation. 



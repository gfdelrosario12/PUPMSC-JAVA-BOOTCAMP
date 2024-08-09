# Java OOP Exercise

## Instructions

1. **Create a parent class called `Animal`.**
2. **Create a subclass called `Dog` and another called `Cat` that both inherit from `Animal`.**
3. **In the `Animal` class, create instance variables `name` and `sound`.**
4. **Implement setters and getters for `name` and `sound` in the `Animal` class.**
5. **Create a method `makeSound` in the `Animal` class that prints the sound of the animal.**
6. **Create a method `tellName` in the `Animal` class that prints the name of the animal.**
7. **Override the `makeSound` method in both `Dog` and `Cat` classes to provide a specific sound for each animal.**
8. **Override the `tellName` method in both `Dog` and `Cat` classes to print a unique message that includes the animal's name.**
    - *Note: When making the `makeSound` and `tellName` methods, use the getter functions.*
9. **In the `main` method, instantiate objects of `Dog` and `Cat`, set their `name` and `sound` (using the setter methods), and call the `makeSound` and `tellName` methods for each.**

**Bonus:** Add a constructor in the `Animal` class that initializes the `name` and `sound` variables, and modify the `Dog` and `Cat` classes to use this constructor.
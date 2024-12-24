
package inheritance;
// Parent class Animal
class Animal {
    // Parent class method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog that overrides makeSound method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");  // Dog's sound
    }
}

// Child class Cat that overrides makeSound method
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");  // Cat's sound
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        // Demonstrating polymorphism using parent class reference

        Animal myDog = new Dog();   // Animal reference, Dog object
        Animal myCat = new Cat();   // Animal reference, Cat object

        // Call makeSound() method using parent class reference
        myDog.makeSound();  // Output: Woof!
        myCat.makeSound();  // Output: Meow!
    }
}

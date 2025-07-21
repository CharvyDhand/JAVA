public class Mai1{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound(); // Outputs: Woof! Woof!
        myCat.makeSound(); // Outputs: Meow Meow!
    }
}
class Animal {
    public void makeSound() {
        System.out.println("Some sounds:");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }
}

class Animal { void sound(){ System.out.println("Some sound"); } }
class Dog extends Animal { void sound(){ System.out.println("Bark"); } }
class Cat extends Animal { void sound(){ System.out.println("Meow"); } }

public class Main {
    public static void main(String[] args) {
        Animal a;
        a = new Dog(); 
        a.sound(); // Output: Bark

        a = new Cat();
        a.sound(); // Output: Meow
    }
}
#Interface Program

##The following program is one of the most important concept of Interfaces in Java ,that helps  exhibit the property of Abstraction in Java

interface Animal{
    public void makeSound();
    public default void eat(){
        System.out.println("Animal is eating");
    }
    public default void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bough Wough");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.makeSound();
    }
}

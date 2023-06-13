import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dynamic Polymorphism - is the ability of an object to take
        //      many shapes or forms after the program is already running

        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("What animal do you want?");
        System.out.print("(1 = dog) or (2 = cat): ");
        int choice = scanner.nextInt();

        //If they type 1 return Dog's method
        if(choice == 1){
            //Use the Dog constructor
            animal = new Dog();
            //Overridden method use
            animal.speak();
        //If they type 2 return Cat's method
        } else if (choice == 2) {
            //Cat constructor
            animal = new Cat();
            //Cat's speak method
            animal.speak();
        }
        //If they type in something wrong
        else{
            animal = new Animal();
            System.out.println("Invalid ");
            animal.speak();
        }
    }
}
package JavaConstructors.level1;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age=age;
    }
    Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Person p1 = new Person(name,age);
        System.out.println("Person 1:");    
        p1.display();

        Person p2 = new Person(p1);
        System.out.println("Person 2 (Copy of Person 1):"); 
        p2.display();
        sc.close();
    }
}

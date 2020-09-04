package Lesson;

import java.util.Scanner;

abstract class Animal
{
    String name;
    int age = 0;
    public void setName(String name) { this.name = name;}
    public String getName(){return name;}
    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
}

interface IRoarable
{
    String roar();
}

class Cat extends Animal implements IRoarable {
    String voice = "Meow";

    Cat(String name){this.name = name;}
    Cat(String name, int age)
    {
        this(name);
        this.age = age;
    }
    public String roar(){return voice;}

    @Override
    public String toString() {
        return "Cat{" +
                "voice='" + voice + '\'' + "  age='" + age +'\'' + "  name= '" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Cat cat = new Cat(input.nextLine(),input.nextInt());
        System.out.println(cat);
        System.out.println(cat.roar());
        input.close();
    }
}

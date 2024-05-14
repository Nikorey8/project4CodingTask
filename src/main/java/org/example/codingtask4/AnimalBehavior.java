package org.example.codingtask4;

public interface AnimalBehavior {

    void eat();

    void sleep();

    void makeSounds();

}

abstract class Animal implements AnimalBehavior {

    String name;
    int age;
    String uniqueAttributes;


    @Override
    public void eat() {
        System.out.println("yum yum yum.....");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZzzzzzZZz....");
    }

    @Override
    public void makeSounds() {
        System.out.println("Roaring....");
    }

    abstract void displayInfo();


}

class Mammal extends Animal {


    @Override
    public void eat() {
        System.out.println("Mammal is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping...");
    }

    @Override
    public void makeSounds() {
        System.out.println("Mammal making sounds...");
    }

    @Override
    void displayInfo() {
        this.eat();
        this.sleep();
        this.makeSounds();
    }
}

class Bird extends Animal {


    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping...");
    }

    @Override
    public void makeSounds() {
        System.out.println("Bird is chirping...");
    }

    @Override
    void displayInfo() {
        this.eat();
        this.sleep();
        this.makeSounds();
    }
}

class Lion extends Mammal {

    Lion(String name, int age, String uniqueAttributes) {
        this.name = name;
        this.age = age;
        this.uniqueAttributes = uniqueAttributes;
    }

    @Override
    public void eat() {
        System.out.println("Lion eating....");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeping ZZZZZ");
    }

    @Override
    public void makeSounds() {
        System.out.println("Lion ROARING....");
    }

    @Override
    void displayInfo() {
        System.out.println(this.name + " " + this.age + " " + this.uniqueAttributes);
        this.eat();
        this.sleep();
        this.makeSounds();
    }
}

class Elephant extends Mammal {

    Elephant(String name, int age, String uniqueAttributes) {
        this.name = name;
        this.age = age;
        this.uniqueAttributes = uniqueAttributes;
    }

    @Override
    public void eat() {
        System.out.println("Elephant eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleeping ZZZzzz");
    }

    @Override
    public void makeSounds() {
        System.out.println("Elephant making sounds...");
    }

    @Override
    void displayInfo() {
        System.out.println(this.name + " " + this.age + " " + this.uniqueAttributes);
        this.eat();
        this.sleep();
        this.makeSounds();
    }
}

class Parrot extends Bird {

    Parrot(String name, int age, String uniqueAttributes) {
        this.name = name;
        this.age = age;
        this.uniqueAttributes = uniqueAttributes;
    }

    @Override
    public void eat() {
        System.out.println("Parrot eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot sleeping ZZZzzz");
    }

    @Override
    public void makeSounds() {
        System.out.println("Parrot chirping....");
    }

    @Override
    void displayInfo() {
        System.out.println(this.name + " " + this.age + " " + this.uniqueAttributes);
        this.eat();
        this.sleep();
        this.makeSounds();
    }
}

class Eagle extends Bird {

    Eagle(String name, int age, String uniqueAttributes) {
        this.name = name;
        this.age = age;
        this.uniqueAttributes = uniqueAttributes;
    }

    @Override
    public void eat() {
        System.out.println("Eagle eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleeping ZZZZzzz");
    }

    @Override
    public void makeSounds() {
        System.out.println("Eagle chirping...");
    }

    @Override
    void displayInfo() {
        System.out.println(this.name + " " + this.age + " " + this.uniqueAttributes);
        this.eat();
        this.sleep();
        this.makeSounds();
    }
}






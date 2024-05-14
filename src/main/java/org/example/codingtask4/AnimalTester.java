package org.example.codingtask4;

public class AnimalTester {
    public static void main(String[] args) {

        Animal obj1=new Lion("Korey",31,"loves dancing");
        Animal obj2=new Elephant("Kiki",24,"loves running");
        Animal obj3=new Parrot("Juju",13,"loves pecking people");
        Animal obj4=new Eagle("Bob",40,"loves flying");

        Animal [] animals={obj1,obj2,obj3,obj4};

        for(Animal a:animals){
            a.displayInfo();
        }
    }
}

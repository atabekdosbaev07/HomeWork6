package com.company;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Eagle(), new Shark(), new Turtle()};

        for(Animal animal:animals ){
            if (animal instanceof Eagle){
                ((Eagle) animal).fly();
            }else if (animal.getClass().getName().equals("com.company.Shark")){
                ((Shark)animal).attack();
            }else {
                ((Turtle)animal).swim();
            }
        }
        System.out.println();

        Eagle[] eagle = {new Eagle()};
        for(Eagle animal1:eagle ){
            animal1.fly();
        }
        Shark[] sharks = {new Shark()};
        for(Shark animal2:sharks ){
            animal2.attack();
        }
        Turtle[] turtles = {new Turtle()};
        for(Turtle animal3:turtles ){
            animal3.swim();
        }




    }

}
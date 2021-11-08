package AnimalRescue;

public class Dog {
    String breed ;
    byte age ;
    float weight ;
    int heightInCm ;
    String name ;
    String color;
    byte health = 10;
    byte hunger = 1;
    byte spirit = 10;

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("zzZZ..(snore)");
    }

    public void speak(){
        System.out.println("Bark! ");
    }

    public void playing(){
        System.out.println("Playing fetch...");
    }
}

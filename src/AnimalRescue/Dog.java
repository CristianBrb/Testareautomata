package AnimalRescue;

public class Dog {
    String breed ;
    byte age ;
    float weight ;
    int heightInCm ;
    String name ;
    String color;

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("zzZZ..(snore)");
    }

    public void speak(){
        System.out.println("Bark! ");
    }

    public void play(){
        System.out.println("Playing fetch...");
    }
}

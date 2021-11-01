package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.breed = "Labrador";
        rex.age = 1;
        System.out.println(rex.name);
        System.out.println(rex.age);
        rex.play();
        rex.name = "Blackie";
        System.out.println(rex.name);

        Dog freddie = new Dog();
        System.out.println(freddie.name);
        freddie.name = "Freddie";

        Dog max = new Dog();
        max.breed = "Buldog";
    }
}

package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.breed = "Labrador";
        rex.age = 1;
        System.out.println(rex.name);
        System.out.println(rex.age);

        rex.name = "Blackie";
        System.out.println(rex.name);

        Dog freddie = new Dog();
        System.out.println(freddie.name);
        freddie.name = "Freddie";

        Dog max = new Dog();
        max.breed = "Buldog";

      Activity preffered = new Activity();

        preffered.prefferedactivity = "Fetch";
        System.out.println(preffered.prefferedactivity);

        DogFood best = new DogFood();
        best.name = "Royal";
        System.out.println(best.name);
    }
}

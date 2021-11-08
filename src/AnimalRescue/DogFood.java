package AnimalRescue;

public class DogFood {
    String name ;
    int price = 10;
    int weight = 1;
    int quantity = 10;
    String disponibility = "available";

    public void wetfood() {
        System.out.println("these R juicy!");
    }

    public void dryfood() {
        System.out.println("crunchy");
    }

    public void available() {
        System.out.println("we have sufficient stock");
    }
    public void notavailable(){
        System.out.println("Out of stock");
    }
}
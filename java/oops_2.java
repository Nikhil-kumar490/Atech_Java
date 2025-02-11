

public class oops_2 {
    public static void main(String[] a) {
        Car c1 = new Car("x1","red",2007 );

        c1.display();
    }
}
class Car{
    String model;
    String color;
    int launchYear;

    Car(String model, String color, int launchYear) {
        this.model=model;
        this.color=color;
        this.launchYear=launchYear;
    }
    void display(){
        System.out.println("Model"+model+"Color="+color+"launch on"+launchYear);
    }
}
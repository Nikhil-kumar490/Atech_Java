public class inheritance_1 {
    public static void main(String[] args) {
     Honda h1=new Honda();
     h1.name_of_car();
    }
}

class  Carr{
    String car_name;
    void name_of_car(){
        this.car_name= "HondaX";
        System.out.println("car is"+ "HondaX");
    }
}
class Honda extends Carr{


}
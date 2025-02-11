public class inheritance_1 {
    public static void main(String[] args) {
     Honda h1=new Honda();
     h1.name_of_car("HondaX");
    }
}

class  Carr{
    String car_name;
    void name_of_car( String car_name){
        this.car_name= car_name;
        System.out.println("car is"+car_name);
    }
}
class Honda extends Carr{


}
public class opps_1 {
    public static void main(String [] a){
       Cars c1=new Cars();
       c1.model= "carx1";
       c1.color="red";
        c1.launchYear=2015;
        c1.display();
    }
}
 class Cars{

    String model;
    String color;
    int launchYear;
    void display(){
        System.out.println("Model= "+model+"Color="+color+ "Lainch on= "+launchYear);
    }

 }
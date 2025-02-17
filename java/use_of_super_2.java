public class use_of_super_2 {
        public static void main(String[] args) {
        Pm p =new Pm();
        p.M();
        Cm s= new Cm();
        s.M();
        }
    }
    class Pm{


    void M(){
        System.out.println("i am P ");
    }

    }
    class Cm extends Pm {
    @Override
    void M(){
        super.M();
        System.out.println("i am Cs");
    }
    }


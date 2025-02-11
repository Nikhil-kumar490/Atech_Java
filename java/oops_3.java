   public class oops_3{
        public static void main(String[] args) {
            Mobile moto = new Mobile("Motorola ", "Black", 2024);
            moto.display();
        }
    }
    class Mobile {
        String model;
        String color;
        int launchYear;

        Mobile(String model, String color, int launchYear) {
            this.model = model;
            this.color = color;
            this.launchYear = launchYear;
        }
        Mobile() {
            this.model = "iphone";
            this.color = "Black";
            this.launchYear = 2003;
        }
        void display() {
            System.out.println("Model: " + model+"Color: " + color+"Launch Year: " + launchYear);
        }
    }





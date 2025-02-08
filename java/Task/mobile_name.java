package Task;
public class mobile_name {
    public static void main(String[] a) {
        mobile moto = new mobile();
        moto.model = "Motorola G85 5G";
        moto.color = " Gray";
        moto.screenSize = 6.7f;
        moto.weight = 190;
        moto.ram = 8;
        moto.storage = 256;
        moto.operatingSystem = "Android 14";
        moto.chargerType = "Type C";
        moto.batteryCapacity = 5000;

        moto.display();
    }
}


class mobile {
    String model;
    String color;
    float screenSize;
    int weight;
    int ram;
    int storage;
    String operatingSystem;
    String chargerType;
    int batteryCapacity;


    void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Weight: " + weight );
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Charger Type: " + chargerType);
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
    }
}
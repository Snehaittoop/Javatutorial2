public class Vehicle {
    String color;
    String brand;
    String modelName;
    int modelYear;
}

class Car extends Vehicle
{
    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.brand="BMW";
        bmw.modelName="3 series";
        bmw.color="black";
        bmw.modelYear=2022;
        System.out.println(bmw.brand);
        System.out.println(bmw.modelName);
        System.out.println(bmw.color);
        System.out.println(bmw.modelYear);
    }
}



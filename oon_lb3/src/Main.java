public class Main {
    public static void main(String[] args) {
        Base.printf();

        Vehicle v1 = new Vehicle(10, 50);
        System.out.println("Vehicle arrives: " + v1.arrive());
        Base.printf();
        System.out.println("Vehicle leaves: " + v1.leave());
        Base.printf();

        Bus b1 = new Bus(5, 50, 5, 60);
        System.out.println("Bus arrives: " + b1.arrive());
        Base.printf();
        System.out.println("Bus leaves: " + b1.leave());
        Base.printf();

        b1.set(10,0);
        System.out.println("Bus arrives: " + b1.arrive());
        Base.printf();

        Truck t1 = new Truck(15.9, 90, 20, 80);
        System.out.println("Truck arrives: " + t1.arrive());
        Base.printf();
        System.out.println("Truck leaves: " + t1.leave());
        Base.printf();

        t1.set(10, 1);
        System.out.println("Truck arrives: " + t1.arrive());
        Base.printf();
    }
}
/*
-------------------------------
Base Current Status
  People on base: 113
  Vehicles on base: 0
  Petrol on base: 500.0
  Goods on base: 50.0
-------------------------------
Vehicle arrives: true
-------------------------------
Base Current Status
  People on base: 114
  Vehicles on base: 1
  Petrol on base: 500.0
  Goods on base: 50.0
-------------------------------
Vehicle leaves: true
-------------------------------
Base Current Status
  People on base: 113
  Vehicles on base: 0
  Petrol on base: 460.0
  Goods on base: 50.0
-------------------------------
Bus arrives: true
-------------------------------
Base Current Status
  People on base: 119
  Vehicles on base: 1
  Petrol on base: 460.0
  Goods on base: 50.0
-------------------------------
Bus leaves: true
-------------------------------
Base Current Status
  People on base: 68
  Vehicles on base: 0
  Petrol on base: 405.0
  Goods on base: 50.0
-------------------------------
Bus arrives: true
-------------------------------
Base Current Status
  People on base: 69
  Vehicles on base: 1
  Petrol on base: 405.0
  Goods on base: 50.0
-------------------------------
Truck arrives: true
-------------------------------
Base Current Status
  People on base: 70
  Vehicles on base: 2
  Petrol on base: 405.0
  Goods on base: 65.9
-------------------------------
Truck leaves: true
-------------------------------
Base Current Status
  People on base: 69
  Vehicles on base: 1
  Petrol on base: 345.0
  Goods on base: 0.0
-------------------------------
Truck arrives: true
-------------------------------
Base Current Status
  People on base: 70
  Vehicles on base: 2
  Petrol on base: 345.0
  Goods on base: 1.0
-------------------------------
 */
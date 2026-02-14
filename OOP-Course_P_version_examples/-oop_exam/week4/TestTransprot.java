package week4;

import week4.nissan.Liberty;

public class TestTransprot {
    
    public static void main(String[] args) {
        // Transport tran = new Transport();
        Car mycar = new Car();
        Nissan nissanCar = new Nissan();
        nissanCar.setName("Thecar");
        Liberty car1 = new Liberty();
        car1.setId(1);
        Liberty car2 = new Liberty();
        car2.setId(1);
        System.out.println(car1.equals(car2));

        System.out.println(nissanCar);
        // Nissan brandCar = new Nissan();
        // Liberty theCar = new Liberty();
   
        // tran.move();
        // mycar.drive();
        // System.out.println(brandCar.getBrand());
        // theCar.hasMultiSeat();

    }

}

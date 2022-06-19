package Praktikum_Pemlan_5;

import java.util.ArrayList;

public class CarData {
    private ArrayList<Car> carList = new ArrayList<>();
    public ArrayList<Car> getCarList() {
        return carList;
    }
    void addCar (String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk));
    }
    void listOfCar() {
        System.out.println("========================================");
        System.out.println("SELURUH DAFTAR MOBIL");
        System.out.println("========================================");
        for (int a = 0; a < carList.size() ; a++) {
            System.out.println("TIPE MOBIL : " + carList.get(a).getCarType());
            System.out.println("NO. POLISI : " + carList.get(a).getPolNum());
            System.out.println("MERK MOBIL : " + carList.get(a).getMerk());
            System.out.println("----------------------------------------");
        }
    }
}

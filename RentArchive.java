package Praktikum_Pemlan_5;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> rentData = new ArrayList<>();

    void Rent (CarRider rider, Car car, int rentDur) {

        if (car.isStatus() == true ){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
    void info(){
        System.out.println("========================================");
        System.out.println("SELURUH DAFTAR SEWA MOBIL");
        System.out.println("========================================");

        for (int a = 0; a < rentData.size(); a++) {
            System.out.println("NAMA PEMINJAM   : " + rentData.get(a).getRider().getName());
            System.out.println("TIPE MOBIL      : " + rentData.get(a).getCar().getCarType());
            System.out.println("MERK MOBIL      : " + rentData.get(a).getCar().getMerk());
            System.out.println("NO POLISI       : " + rentData.get(a).getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + rentData.get(a).getRentDur());
            System.out.println("----------------------------------------");
        }
    }
}

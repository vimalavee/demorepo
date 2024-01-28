import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mobile {
    private int mobileId;
    private String brand;

    public Mobile(int mobileId, String brand) {
        this.mobileId = mobileId;
        this.brand = brand;
    }

    public int getMobileId() {
        return mobileId;
    }

    public String getBrand() {
        return brand;
    }
}

class Laptop {
    private int laptopId;
    private String brand;

    public Laptop(int laptopId, String brand) {
        this.laptopId = laptopId;
        this.brand = brand;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }
}

public class IteratorBrand1 {
    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();
        List<Laptop> laptops = new ArrayList<>();

        mobiles.add(new Mobile(1, "BrandX"));
        laptops.add(new Laptop(101, "BrandX"));
        mobiles.add(new Mobile(2, "BrandY"));
        laptops.add(new Laptop(102, "BrandX"));
        mobiles.add(new Mobile(3, "BrandX"));

        String targetBrand = "BrandX";

        // Iterate over mobiles
        for (Mobile mobile : mobiles) {
            if (mobile.getBrand().equals(targetBrand)) {
                System.out.println("Mobile ID: " + mobile.getMobileId() + ", Brand: " + mobile.getBrand());
            }
        }

        // Iterate over laptops
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equals(targetBrand)) {
                System.out.println("Laptop ID: " + laptop.getLaptopId() + ", Brand: " + laptop.getBrand());
            }
        }
    }
}
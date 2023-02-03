import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
    Car car2 = new Car("Audi","A850LTDIQuattro",0.3, "Черный", 2020, "Германия");
    Car car3 = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
    Car car4 = new Car("Kia","Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
    Car car5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        System.out.println(Arrays.toString (new Car[]{car1}));
    }

}
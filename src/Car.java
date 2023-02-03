public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public Car (String brand, String model, double engineVolume, String color, int year, String country) {
this.brand = brand;
        if (brand == null || brand.isEmpty()) {
            brand = "defolt";
        }

this.color = color;
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
this.model=model;
this.country = country;
this.year = year;
        if (year <= 0) {
            year = 2000;
        }
    }

    @Override
    public String toString() {
        return " Бренд: " + brand + " Модель: " + model + " Объем двигателя: " + engineVolume + " Цвет : " + color + " Страна : " + country + "Год выпуска : " + year;
    }
}

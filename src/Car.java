public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country){
        if (brand == null){
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null){
            this.model = "default";
        }else {
            this.model = model;
        }
        if (country == null){
            this.country = "default";
        }else {
            this.country = country;
        }
        if (Double.compare(engineVolume, 0) == 0){
            this.engineVolume = 1.6;
        }else {
            this.engineVolume = engineVolume;
        }
        if (color == null){
            this.color = "белый";
        }else {
            this.color = color;
        }
        if (year == 0 ){
            this.year = 2000;
        }else {
            this.year = year;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }
    void characteristics(){
        System.out.println( brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", цвет кузова — " + color +
                ", объем двигателя — " + engineVolume + "л.");

    }

}

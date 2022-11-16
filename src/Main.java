public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");

        Human maxim = new Human("Максим", 1988,"Минск", "бренд-менеджером");
        maxim.acquaintance();

        Human anya = new Human("Аня", 1993, "Москва", "методистом образовательных программ");
        anya.acquaintance();

        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджером");
        katya.acquaintance();

        Human artem = new Human("Артем", 1995, "Москва", "директором по развитию бизнеса");
        artem.acquaintance();

        System.out.println();

        System.out.println("Задание 3");
        Car lada = new Car("Lada", "Granta", 1.7,"желтый", 2015, "России");
        lada.characteristics();

        Car audi = new Car("Audi", "A8 50 L TDI quattro",3.0, "черный", 2020, "Германии");
        audi.characteristics();

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германии");
        bmw.characteristics();

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее");
        kia.characteristics();

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        hyundai.characteristics();

    }
}
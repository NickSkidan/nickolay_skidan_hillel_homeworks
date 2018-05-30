public class ProcessorCar {
    int thisYear = 2018;
    Car[] garage;

    public void findCarByMark(String mark) {
        System.out.println("Список автомобилей марки " + mark + ":");
        for (int i = 0; i < garage.length; i++) {
            if (mark.equals(garage[i].mark)) {
                System.out.println(i);
            }
        }
    }

    public void findCarByModelAndAge(String model, int age) {
        System.out.println("Список автомобилей модели " + model + ", которые эксплуатируются больше " + age + " лет:");
        for (int i = 0; i < garage.length; i++) {
            if (model.equals(garage[i].model) & age < (thisYear - garage[i].releaseYear)) {
                System.out.println(i);
            }
        }
    }

    public void findCarByReleaseYearAndPrice(int releaseYear, int price) {
        System.out.println("Список автомобилей " + releaseYear + " года выпуска, цена которых больше " + price);
        for (int i = 0; i < garage.length; i++) {
            if (releaseYear == garage[i].releaseYear & price <= garage[i].price) {
                System.out.println(i);
            }
        }
    }
}

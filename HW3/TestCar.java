public class TestCar {
    public static void main(String[] args) {
        ProcessorCar cars = new ProcessorCar();
        cars.garage = new Car[9];
        cars.garage[0] = new Car("BMW", "M5", 2010, "red", 45000, 0077);
        cars.garage[1] = new Car("NISSAN", "Touareg", 2014, "black", 65000, 1432);
        cars.garage[2] = new Car("PORSCHE", "Panamera", 2016, "yellow", 125000, 0001);
        cars.garage[3] = new Car("BMW", "X6", 2016, "black", 78000, 9043);
        cars.garage[4] = new Car("LADA", "2106", 1985, "dirty", 500, 6699);
        cars.garage[5] = new Car("VOLGA", "3110", 1993, "white", 1850, 3341);
        cars.garage[6] = new Car("BMW", "M5", 2008, "blue", 40000, 9822);
        cars.garage[7] = new Car("AUDI", "Q7", 2016, "gold", 90000, 1717);
        cars.garage[8] = new Car("BMW", "M5", 2017, "silver", 55000, 5596);
        cars.findCarByMark("BMW");
        cars.findCarByModelAndAge("M5", 5);
        cars.findCarByReleaseYearAndPrice(2016, 85000);
    }
}

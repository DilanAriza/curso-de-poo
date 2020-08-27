class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car("SMT435", new Account("Dilan Ariza", "1000133804"));
        car.passagenger = 4;
        car.printDataCar();

        Car car2 = new Car("SGT943", new Account("Santiago Cañon", "1000133805"));
        car2.passagenger = 3;
        car2.printDataCar();
    }
}
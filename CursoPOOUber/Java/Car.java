class Car {
    Integer id;
    String license;
    Account driver;
    Integer passagenger;    

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: " + license + " Name Driver: " + driver.name);
    }
}
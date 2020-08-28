class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passagenger;    

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        // System.out.println("Passengers: " + this.passagenger);
    }

    void printDataCar(){
        if(passagenger != null && license != null && driver != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + this.passagenger);
        }else{
            System.out.println("Error, the data output is empty!");
        }
    }

    public Integer getPassenger(){
        return passagenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passagenger = passenger;
        }else{
            System.out.println("You need assigned 4 passengers");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
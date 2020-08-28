class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        UberX uberX = new UberX("SMT435", new Account("Dilan Ariza", "1000133434"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        // UberVan ubenVan = new UberVan("GTB435", new Account("Dilan Ariza", "1000133434"));
        // ubenVan.setPassenger(6);
        // ubenVan.printDataCar();


        // Car car2 = new Car("SGT943", new Account("Santiago Cañon", "1000133555"));
        // // car2.passagenger = 3;
        // car2.printDataCar();


    //     System.out.println("PAYMENTS \n");
    //     Payment payment = new Payment(1, 325.2);
    //     payment.printDataPayment();

    //     Cash cash = new Cash(2, 325.3);
    //     cash.printDataPayment();

    //     Card card = new Card(3, 400.0, "10008000", "20122020");
    //     card.printDataPayment();

    //     Paypal paypal = new Paypal(4, 540.0, "dilan@gmail.com");
    //     paypal.printDataPayment();

    //     User user = new User("Dilan", "539483458430");
    //     user.printDataAccount();

        
    //     Driver driver = new Driver("Dilan", "539483458430");
    //     driver.printDataAccount();
    }
}
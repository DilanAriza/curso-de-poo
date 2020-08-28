class Driver extends Account {
    public Driver(String name, String document){
        super(name, document);
    }

    public void printDataAccount(){
        super.printDataAccount();
        System.out.println("Type of account: Driver");
    }
}
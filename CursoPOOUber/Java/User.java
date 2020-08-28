class User extends Account {
    public User(String name, String document){
        super(name, document);
    }

    public void printDataAccount(){
        super.printDataAccount();
        System.out.println("Type of account: User");
    }
}
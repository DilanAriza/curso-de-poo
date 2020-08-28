class Cash extends Payment{

    public Cash(Integer id, Double amount){
        super(id, amount);
    }

    public void printDataPayment(){
        System.out.println("Method of pay: Cash");
        super.printDataPayment();
    }
}
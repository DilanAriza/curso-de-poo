class Paypal extends Payment{
    String email;
    
    public Paypal(Integer id, Double amount, String email){
        super(id, amount);
        this.email = email;
    }     

    public void printDataPayment(){
        System.out.println("Method of pay: Paypal");
        super.printDataPayment();
        System.out.println("Email: " + this.email); 
    }
}
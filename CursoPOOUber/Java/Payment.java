public class Payment {
    Integer id;
    Double amount;
    
    public Payment(Integer id, Double amount){
        this.id = id;
        this.amount = amount;
    }

    public void printDataPayment(){
        System.out.println("Id: " + this.id + " Amount: " + this.amount);
    }
}
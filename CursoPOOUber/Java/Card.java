class Card extends Payment{
    String number;
    String expiracy;

    public Card(Integer id, Double amount, String number, String expiracy){
        super(id, amount);
        this.number = number;
        this.expiracy = expiracy;
    }

    public void printDataPayment(){
        System.out.println("Method of pay: Card");
        super.printDataPayment();
        System.out.println("Number: " + this.number + " Expiracy: " + this.expiracy);
    }
}
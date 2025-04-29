public class Variables {
    void showInterest(){
        double interest;
        double amount;

        amount=100000.0;
        System.out.println("Amount: " + amount);

        interest=3.0;
        amount=amount * (100+interest)/100;
        System.out.println("After a year " + amount);

        amount= amount * (100+interest)/100;
        System.out.println("After two years " + amount);
    }
    public static void main(String[] args) {
        new Variables().showInterest();
    }
}

// Step 1: Create an interface
interface Client {
    double calculateFee();
}

// Step 2: Implement the interface in multiple classes
class IndividualClient implements Client {
    public double calculateFee() {
        return 100.0;
    }
}

class CorporateClient implements Client {
    public double calculateFee() {
        return 250.0;
    }
}

// Step 3: Use the interface in the fee calculator
class FeeCalculator {
    public void printFee(Client client) {
        System.out.println("Total fee: $" + client.calculateFee());
    }
}

// Main class
public class LawLinkOCP {
    public static void main(String[] args) {
        FeeCalculator calc = new FeeCalculator();
        Client individual = new IndividualClient();
        Client corporate = new CorporateClient();

        calc.printFee(individual);   // Output: Total fee: $100.0
        calc.printFee(corporate);    // Output: Total fee: $250.0
    }
}
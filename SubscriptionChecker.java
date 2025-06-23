import java.util.Random;

public class SubscriptionChecker {

    public static void main(String[] args) {
        Random random = new Random();
        int daysUntilExpiration = random.nextInt(12); // 0 to 11
        int discountPercentage = 0;

        // Determining discount
        if (daysUntilExpiration == 1) {
            discountPercentage = 20;
        } else if (daysUntilExpiration <= 5 && daysUntilExpiration > 0) {
            discountPercentage = 10;
        }

        
        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) {
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        } else if (daysUntilExpiration <= 5) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        } else {
            System.out.println("You're good for now — no renewal needed yet.");
        }
    }
}

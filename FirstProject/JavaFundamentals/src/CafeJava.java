public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.5;
        double latte = 4.5;
        double cappucino = 3.75;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        // boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        // boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage + ". " +displayTotalMessage + cappucino);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        
        if (isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage + ". " +displayTotalMessage + latte * 2);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        double total = cappucino - dripCoffee;
        System.out.println(customer3 + " " + displayTotalMessage + total);
    }
}

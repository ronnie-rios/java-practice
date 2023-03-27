import java.util.ArrayList;

public class CafeUtil {
    public static void main(String[] args) {
        
    }

    public int getStreakGoal (int numWeeks) {
       
        int sum = 0;
        for (int i =1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) {
          sum += price;
        }
        return sum;
      }
    
    public void displayMenu(ArrayList<String>menuItems) {
      for (int i =0; i < menuItems.size(); i++) {
        System.out.print(menuItems.indexOf(menuItems.get(i)) + ' ' + menuItems.get(i) + ' ');
      }
    }

    public void addCustomer(ArrayList<String>customers) {
      System.out.println("Please enter your name:");
      String userName = System.console().readLine();
      System.out.printf("Hello, %s!\n", userName);
      int numAhead = customers.size();
      System.out.printf("There are %d people in front of you\n", numAhead);
      customers.add(userName);
      System.out.println(customers);
    }
}
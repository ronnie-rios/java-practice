package CafeUtil;
public class CafeUtil {
    public static void main(String[] args) {
        
    }

    public int getStreakGoal () {
        int numWeeks = 10;
        int sum = 0;
        for (int i =1; i <= numWeeks; i++) {
            sum += 1;
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
}
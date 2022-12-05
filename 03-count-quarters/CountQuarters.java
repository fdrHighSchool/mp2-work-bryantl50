public class Main {
 public static void main(String[] args) {
   System.out.println(quarter(2000));
    }
    public static int quarter(int num) {
    String nums = Integer.toString(num);
    String var;
    if (nums.length() < 1) {
            return 0; } 
            else {
            var = nums.substring(nums.length() - 4);
            int num1 = Integer.parseInt(var) / 25;
            return num1;
        }
    }
}

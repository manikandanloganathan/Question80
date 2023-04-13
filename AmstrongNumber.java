public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = num;

        while (0 < num) {
            int r = num % 10;
            sum = (r * r * r) + sum;
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("its a amstrong");
        } else {
            System.out.println("its not  a amstrong");
        }
    }
}

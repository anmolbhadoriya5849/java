public class Q_18 {
    public static void main(String[] args) {
        int count = 0, num = 20000;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}
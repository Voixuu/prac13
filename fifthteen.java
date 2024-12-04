package pac;

public class fifthteen {
    public static void Reversed(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            System.out.print(n % 10 + " ");
            Reversed(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        Reversed(number);
    }
}

package pac;
import java.util.Scanner;
public class seventeen {
    public static int findMax() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            return 0;
        }
        return Math.max(num, findMax());
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел, заканчивающуюся 0:");
        System.out.println("Максимальное число в последовательности: " + findMax());
    }
}

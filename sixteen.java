package pac;
import java.util.Scanner;
public class sixteen {
    public static int[] countMax() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            return new int[]{0, 0};
        }
        int[] result = countMax();
        int maxValue = result[0];
        int count = result[1];
        if (num > maxValue) {
            return new int[]{num, 1};
        } else if (num == maxValue) {
            return new int[]{maxValue, count + 1};
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел, заканчивающуюся 0:");
        int[] result = countMax();
        System.out.println("Максимальное число: " + result[0]);
        System.out.println("Количество элементов, равных максимуму: " + result[1]);
    }
}

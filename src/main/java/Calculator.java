import java.util.Scanner;
/**
 * @see Class Calculator выполняет сложение дробных чисел
 * @author Гудименко Олег
*/
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Ведите второе чилсо");
        double b = scanner.nextDouble();
        double c = a+b;
        System.out.print("Сумма равна ");
        System.out.printf("%.4f",c);
        scanner.close();
    }
}



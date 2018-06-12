import java.util.Scanner;

public class Division{

}

public class Subtraction{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите уменьшаемое");
    double a = scanner.nextDouble();
    System.out.println("Ведите вычитаемое");
    double b = scanner.nextDouble();
    double c = a-b;
    System.out.print("Разность равна ");
    System.out.printf("%.4f",c);
    scanner.close();
        }

public class Multiplication{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первый множитель");
    double a = scanner.nextDouble();
    System.out.println("Ведите второе множитель");
    double b = scanner.nextDouble();
    double c = a*b;
    System.out.print("Произведение равно ");
    System.out.printf("%.4f",c);
    scanner.close();
}
/**
 * @see Class Calculator выполняет сложение дробных чисел
 * @author Гудименко Олег
*/
public class Calculator {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слагаемое");
        double a = scanner.nextDouble();
        System.out.println("Ведите второе слагаемое");
        double b = scanner.nextDouble();
        double c = a+b;
        System.out.print("Сумма равна ");
        System.out.printf("%.4f",c);
        scanner.close();
    }




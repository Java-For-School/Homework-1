import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age, year;
        Scanner scanner = new Scanner(System.in);

        Draw myDrawer = new Draw();
        AgeCalculator calculator;

        Draw.drawFace();
        Draw.drawShape(3, false);

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        calculator = new AgeCalculator(age, year);

        System.out.println("User will be 20 in: " + calculator.calculate(20));
        System.out.println("User will be 25 in: " + calculator.calculate(25));
    }
}
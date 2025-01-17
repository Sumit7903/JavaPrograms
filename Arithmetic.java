import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        //Addition
        int add = num1 + num2;
        System.out.println("Addition is:"+add);
        //Substraction
        int sub = num1 - num2;
        System.out.println("Subtraction is:"+sub);
        //Multiplication
        int mul = num1 * num2;
        System.out.println("Multiplication is:"+mul);
        //Division
        int div = num1 / num2;
        System.out.println("Division is:"+div);
        //Mod
        int mod = num1 % num2;
        System.out.println("Mod is:"+mod);

    }
}
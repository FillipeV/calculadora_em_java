import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;

        int soma = num1 + num2;
        System.out.println("Resultado da soma é: " + soma);

        int sub = num1 - num2;
        System.out.println("Resultado da subtração é: " + sub);

        int mul = num1 * num2;
        System.out.println("Resultado da multiplicação é: " + mul);

        double div =(double) num1 / num2;
        System.out.println("Resultado da divisão é: " + div);

        System.out.printf("Resultado da divisão é: %.2f %n", div);
    }

}
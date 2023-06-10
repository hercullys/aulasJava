import java.util.Locale;
import java.util.Scanner;

class operadores{
    public static void main(String[] args) {
        exercicio03();
    }

    public static void exercicio03() {
        System.out.println("Calculadora de soma");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Configura o locale para usar o separador decimal "."

        System.out.print("Informe o primeiro numero:");
        float num1 = scanner.nextFloat();

        System.out.print("Informe o segundo numero:");
        float num2 = scanner.nextFloat();

        float soma = num1 + num2;
        System.out.println("A soma dos valores é: " + soma);

        scanner.close();
    }
}

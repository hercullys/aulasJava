import java.util.Scanner;

class imprimir{
    public static void main(String[] args){
        System.out.println("Olá mundo");
        System.out.print("Olá mundo");
        System.out.print("Olá mundo");
        System.out.printf("Olá mundo");

        System.out.println("Informe seu nome");

        String palavra;
        try (Scanner entrada = new Scanner(System.in)) {
            palavra = entrada.next();
        }
        System.out.println("Nome digitado:" + palavra);
    }
}

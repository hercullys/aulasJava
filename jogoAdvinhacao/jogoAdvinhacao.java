package jogoAdvinhacao;

import java.util.Scanner;

import java.util.Random;

class Main{
    public static void main(String[] args){
        

        // Escolha o nível de dificuldade
        Scanner dificuldade = new Scanner(System.in);
        System.out.println("Escolha o nível de dificuldade:");
        System.out.println("1 - Fácil \n 2 - Médio \n 3 - Difícil");
        int nivelDificuldade = dificuldade.nextInt();

        // Criar os níveis de dificuldade
        switch (nivelDificuldade){
            case 1:

                Random gerador = new Random(0);
                int numeroAleatorio = gerador.nextInt(10);
                // Receber valor digitado no teclado
                Scanner entradaUsuario = new Scanner(System.in);
                System.out.println("Advinhe o nº que estou  pensando");
                int numeroUsuario = entradaUsuario.nextInt();

                if(numeroUsuario == numeroAleatorio){
                    System.out.println("Parabéns, vc acertou, eu pensei no " + numeroAleatorio);
                }
                else{
                    System.out.println("Você errou :c  pensei no " + numeroAleatorio);
                }
                entradaUsuario.close();

                break;
        
            case 2:
                Random gerador1 = new Random(0);
                int numeroAleatorio1 = gerador1.nextInt(50);

                // Receber valor digitado no teclado
                Scanner entradaUsuario1 = new Scanner(System.in);
                System.out.println("Advinhe o nº que estou  pensando");
                int numeroUsuario1 = entradaUsuario1.nextInt();

                if(numeroUsuario1 == numeroAleatorio1){
                    System.out.println("Parabéns, vc acertou, eu pensei no " + numeroAleatorio1);
                }
                else{
                    System.out.println("Você errou :c  pensei no " + numeroAleatorio1);
                }
                entradaUsuario1.close();

                break;

            case 3:
                
                Random gerador2 = new Random(0);
                int numeroAleatorio2 = gerador2.nextInt(100);

                // Receber valor digitado no teclado
                Scanner entradaUsuario2 = new Scanner(System.in);
                System.out.println("Advinhe o nº que estou  pensando");
                int numeroUsuario2 = entradaUsuario2.nextInt();

                if(numeroUsuario2 == numeroAleatorio2){
                    System.out.println("Parabéns, vc acertou, eu pensei no " + numeroAleatorio2);
                }
                else{
                    System.out.println("Você errou :c  pensei no " + numeroAleatorio2);
                }
                entradaUsuario2.close();

                break;
            
            default:
                System.out.println("Valor inválido");
                break;

        }
    }
}
package estruturaCondicional;

class condicional{
    public static void main(String[] args) {
        
        // Estrutura aninhada
        int nota = 6;

        if(nota >= 5 && nota <=10){
            System.out.println("Aprovado");
        }
        else if(nota >= 3 && nota < 5){
            System.out.println("Exame");
        }
        else if(nota < 3){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Valor inválido");
        }
    }
}

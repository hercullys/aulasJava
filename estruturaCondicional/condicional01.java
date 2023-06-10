package estruturaCondicional;

class Main {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7 && nota <= 10){
            System.out.println("Aprovado");
        }
        if(nota >= 5 && nota <= 7){
            System.out.println("Prova final");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
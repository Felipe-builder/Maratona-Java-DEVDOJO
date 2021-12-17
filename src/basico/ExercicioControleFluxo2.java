package basico;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Terça-Feira");
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

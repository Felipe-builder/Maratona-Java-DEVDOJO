package basico;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Dia util");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

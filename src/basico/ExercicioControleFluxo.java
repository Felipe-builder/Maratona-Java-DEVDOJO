package basico;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        double salario = 5000;

        if(salario < 1000)
            salario -= salario * 0.05;
        else if (salario < 2000)
            salario -= salario * 0.1;
        else if (salario < 4000)
            salario -= salario * 0.15;
        else
            salario -= salario * 0.2;


        System.out.printf("O salário de R$ %.2f", salario);
    }
}

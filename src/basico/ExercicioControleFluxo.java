package basico;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        double salario = 3500;
        double totalImposto = 0;

        if(salario < 1000)
            totalImposto = salario * 0.05;
        else if (salario < 2000)
            totalImposto = salario * 0.1;
        else if (salario < 4000)
            totalImposto = salario * 0.15;
        else
            totalImposto = salario * 0.2;


        System.out.printf("O salário de R$ %.2f terá o toral de impsno valor de R$ %.2f", salario, totalImposto);
    }
}

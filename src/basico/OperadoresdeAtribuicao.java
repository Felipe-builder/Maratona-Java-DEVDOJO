package basico;

public class OperadoresdeAtribuicao {
    public static void main(String[] args) {
        // =, -=. +=. /=, *=, %=
        int salario = 1000;
        salario = salario + 1000;
        salario += 1000;

        System.out.println(salario);

        salario -= 1000;
        System.out.println(salario);

        salario += salario * 0.1;

        System.out.println(salario);

        salario %= 2;
        System.out.println(salario);


    }
}

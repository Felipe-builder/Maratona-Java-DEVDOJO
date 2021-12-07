package basico;

public class RelatorioEmpregado {
    public static void main(String[] args) {
        String nome = "Iasmim Siqueira";
        float salario = 2100.00F;
        char sexo = 'F';
        byte idade = 18;
        String estadoCivil = "Casada";

        System.out.printf("O empregado(a) %s do sexo %c, idade %d, estado civil %s e salário R$ %.2f encontra-se empregado neste estabelecimento.", nome, sexo, idade, estadoCivil, salario);
    }
}

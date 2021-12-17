package basico;

public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 20;
        float salario = 2000f;
        if (idade >= 18 && salario >= 2000) {
            System.out.println("entrou no clube");
        } else {
            System.out.println("não pode entrar no clube");
        }

        String categoria = "";
        if (idade <= 10) {
            System.out.println("MIRIM");
        } else if(idade <= 16) {
            System.out.println("INFANTIL");
        } else if (idade <= 20) {
            System.out.println("JUVENIL");
        } else {
            System.out.println("ABERTO");
        }
    }
}

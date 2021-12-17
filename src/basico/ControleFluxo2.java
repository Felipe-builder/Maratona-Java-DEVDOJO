package basico;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        System.out.println(idade <= 10 ? "mirim" : idade <= 15 ? "infantil" : idade < 20 ? "juvenil" : "velho demais");
    }
}

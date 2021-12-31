package basico;

public class ControleFluxo5 {
    public static void main(String[] args) {
        // dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        // porém as parcelas não devem ser menores do que 1000

        double valorTotal = 30000;

        for (int i = 1; i < valorTotal; i++) {
            double valorParcela = valorTotal / i; // i => parcela
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(i + "X de R$" + valorParcela);
        }
    }
}

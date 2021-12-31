package basico;

public class ControleFluxo6 {
    public static void main(String[] args) {
        // dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        // porém as parcelas não devem ser menores do que 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela <= 1000) {
                continue;
            }
            System.out.println(parcela + "X de R$" + valorParcela);

        }
    }
}

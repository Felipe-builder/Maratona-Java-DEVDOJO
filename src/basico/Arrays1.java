package basico;

public class Arrays1 {
    public static void main(String[] args) {
        int[] idades = new int[4];
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;
        idades[3] = 25;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Na posição " + i + " tem o valor: " + idades[i]);
        }
    }
}

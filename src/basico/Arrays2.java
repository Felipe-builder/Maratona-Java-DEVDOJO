package basico;

public class Arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char = '\u0000' ' '
        // boolean = false
        // reference = null

        int[] idades = new int[3];

        for (int i = 0; i < idades.length; i++) {
            System.out.println( i + "º - idade: " + idades[i] );
        }

        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}

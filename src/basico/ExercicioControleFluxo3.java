package basico;

public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        int c = 0;
        while(c <= 100000) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
            c++;
        }

    }
}

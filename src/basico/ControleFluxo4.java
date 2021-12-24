package basico;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int c = 0;
        while(c < 10){
            System.out.println(c++);
        }

        do {
            System.out.println(c--);
        } while(c >= 0);

        for( int i = 0; i < 10; i++) {
            System.out.println("valor de i é: " + i);
            if(i==5) {
                break;
            }
        }


    }
}

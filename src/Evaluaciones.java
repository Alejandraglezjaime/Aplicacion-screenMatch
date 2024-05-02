import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double calificacionPelicula = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (calificacionPelicula != -1){
            System.out.println("Que calificación le darías a la película Amor y moustros");
            calificacionPelicula = teclado.nextDouble();

            if (calificacionPelicula != -1) {
                mediaEvaluaciones += calificacionPelicula;
                totalEvaluaciones++;
            }
        }
        System.out.println(mediaEvaluaciones/totalEvaluaciones);
    }
}

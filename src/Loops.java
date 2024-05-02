import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double calificacionPelicula = 0;
        double mediaEvaluaciones =0;

        for (int i=0; i<3; i++){
            System.out.println("Que calificación le darías a la película Amor y moustros");
            calificacionPelicula = teclado.nextDouble();
            mediaEvaluaciones +=calificacionPelicula;
        }
        System.out.println(mediaEvaluaciones/3);
    }


}

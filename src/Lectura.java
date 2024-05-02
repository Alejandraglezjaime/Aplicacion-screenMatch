import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine(); //LEE LOS DATOS INGRESADOS POR EL USUARIO
        System.out.println("Escribe su fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Que calificacion le das a la película");
        double calificacionPelicula = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(calificacionPelicula);
    }
}

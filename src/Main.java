public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match version 1");
        System.out.println("Película: Amor y moustros");
        int fechaDeLanzamiento = 2020;
        boolean plan = true;
        double calificacionPelicula = 8.2;

        double media = (8.2+7.0+9.0)/3;
        System.out.println(media);

        String sinopsis = """
                Han pasado 7 años desde que una horda de monstruos arrasó el mundo. 
                Joel ha vivido estos años escondido en el subsuelo, pero, cuando consigue contactar por radio con su novia de la escuela, 
                decide arriesgarlo todo y viajar 150 km. para verla.
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

    }
}

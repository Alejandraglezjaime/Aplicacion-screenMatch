public class Desiciones {

    public static void main(String[] args){
        int fechaDeLanzamiento = 2020;
        boolean plan = true;
        double calificacionPelicula = 8.2;
        String tipoPlan = "plus";

        if(fechaDeLanzamiento >2022){
            System.out.println("Películas más populares");
        } else {
            System.out.println("Peliculas retro que aun valen la pena ver : ");
        }

        if (plan || tipoPlan.equals("plus")){
            System.out.println("Disfrute su pelicula");
        } else {
            System.out.println("Película no disponible para su plan actual ");
        }

    }
}

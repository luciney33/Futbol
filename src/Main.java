public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo(13, "Atleti");
        Jugador jugador1 = new Jugador(10, "Lionel Messi", 750, 700, equipo1);
        System.out.println(jugador1.toString());
        System.out.println();
    }
}
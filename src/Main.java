public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo(13, "Atleti");
        Jugador jugador1 = new Jugador(10, "Lionel Messi", 750, 7, equipo1);
        Jugador jugador2 = new Jugador(76, "NEYMAR", 750, 10, equipo1);
        Jugador jugador3 = new Jugador(19, "cRISTI", 750, 8, equipo1);
        System.out.println(jugador1.toString());
        equipo1.ordernarGoles();
    }
}
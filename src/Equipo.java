public class Equipo {
    private int idEquipo;
    private String nombreEquipo;
    private Jugador[] jugadores = new Jugador[10];

    public Equipo() {}
    public Equipo(int idEquipo, String nombreEquipo, Jugador[] jugadores) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
    }
    public Equipo(int idEquipo, String nombreEquipo){
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public Jugador[] getJugadores() {
        return jugadores;
    }
    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public void mostrarDatosEquipo() {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                System.out.println(jugadores[i].toString());
            }else {
                System.out.println("No se encontro el jugador");
            }
        }
    }

    public void mostrarDatosJugador(String nombre) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getNombre().equals(nombre)) {
                System.out.println(jugadores[i].toString());
            }else {
                System.out.println("No se encontro el jugador");
            }
        }
    }

    public String mejorDelantero(){
        Jugador mejorDelantero = null;
        if (jugadores[0] != null) {
            mejorDelantero = jugadores[0];
            for (int i = 1 ; i < jugadores.length; i++) {
                if (jugadores[i] != null && jugadores[i].getGoles() > mejorDelantero.getGoles()) {
                    mejorDelantero = jugadores[i];
                }
            }
        }else {
                System.out.println("No se encontro el jugador");
        }
        return mejorDelantero.getNombre();
    }

    public void ordernarGoles(){
        Jugador auxJugador = jugadores[0];
        for (int i = 1; i < jugadores.length; i++) { //esta mal corregirlo en casa
            if (jugadores[i] != null && jugadores[0] != null && jugadores[i].getGoles() > auxJugador.getGoles()) {
                jugadores[i] = auxJugador;
                auxJugador = jugadores[i];
            }
        }
    }

}

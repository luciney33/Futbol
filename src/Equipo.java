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
        for (int i = 0; i < jugadores.length; i++) {
            Jugador auxJugador = new Jugador();
            for (int j = i + 1; j < jugadores.length; j++) {
                if (jugadores[i] != null && jugadores[j] != null && jugadores[i].getGoles() < jugadores[j].getGoles()){
                    auxJugador = jugadores[i];
                    jugadores[i] = jugadores[j];
                    jugadores[j] = auxJugador;
                }
            }
        }
    }
    /*Es decir, en una iteración completa de i = 0:
    Compara i = 0 con j = 1
    Compara i = 0 con j = 2
    Compara i = 0 con j = 3
    ...
    Luego i = 1:
    Compara i = 1 con j = 2
    Compara i = 1 con j = 3
    */

    public void darBaja(int id){
        boolean encontrado = false;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getIdJugador() == id) {
                jugadores[i] = null;
                encontrado = true;
            }
            if (!encontrado) {
                System.out.println("No se encontro el jugador");
            }
        }
    }

}

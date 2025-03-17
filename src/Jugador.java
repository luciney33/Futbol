public class Jugador {
    private int idJugador;
    private String nombre;
    private int partidosJugados;
    private int goles;
    private Equipo equipo;

    public Jugador() {}

    public Jugador(int idJugador, String nombre, int partidosJugados, int goles, Equipo equipo) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.goles = goles;
        this.equipo = new Equipo();
    }

    public int getIdJugador() {
        return idJugador;
    }
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public double promedioGoles() {
        double promedio = 0;
        if (partidosJugados > 0) {
            promedio = goles / partidosJugados;
        }else {
            System.out.println("El jugador no tiene partidos jugados");
        }
        return promedio;
    }

    @Override
    public String toString() {
        return "Jugador:" + "\n"+
                "IdJugador = " + idJugador +
                ", Nombre = " + nombre +
                ", PartidosJugados =" + partidosJugados +
                ", Goles=" + goles+
                ", NombreEquipo = " + equipo.getNombreEquipo();
    }
}

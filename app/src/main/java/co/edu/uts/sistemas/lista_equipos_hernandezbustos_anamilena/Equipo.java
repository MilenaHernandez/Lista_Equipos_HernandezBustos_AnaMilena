package co.edu.uts.sistemas.lista_equipos_hernandezbustos_anamilena;

public class Equipo {

    private long codigo;
    private String nombre;
    private long serial;
    private String foto = "https://images2-mega.cdn.mdstrm.com/etcetera/2019/03/06/7778_1_5c8035c88436d.jpg?d=500x500";

    public Equipo(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", serial=" + serial +
                ", foto='" + foto + '\'' +
                '}';
    }
}

package co.edu.uts.sistemas.lista_equipos_hernandezbustos_anamilena;

import java.util.ArrayList;

public class Info {

    public static final ArrayList<Equipo> EQUIPOS = new ArrayList<>();

    public static void cargarEquipos(int n) {
        for (int i=1; i<=n; i++) {
            Equipo eq = new Equipo(i,"Equipo"+i);
            eq.setCodigo(i);
            eq.setSerial(i);
            Info.EQUIPOS.add(eq);
        }
    }
}

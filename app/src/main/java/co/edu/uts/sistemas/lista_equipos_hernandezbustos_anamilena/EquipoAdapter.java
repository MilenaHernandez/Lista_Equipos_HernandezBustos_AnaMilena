package co.edu.uts.sistemas.lista_equipos_hernandezbustos_anamilena;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class EquipoAdapter extends BaseAdapter {

    private Context contexto;
    private ArrayList<Equipo> equipos;

    public EquipoAdapter(Context contexto, ArrayList<Equipo> equipos) {
        this.contexto = contexto;
        this.equipos = equipos;
    }

    @Override
    public int getCount() {
        return equipos.size();
    }

    @Override
    public Object getItem(int position) {
        return equipos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return equipos.get(position).hashCode();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            view = LayoutInflater.from(contexto).inflate(R.layout.vista_equipo,null);
        }
        TextView nomEquipo = view.findViewById(R.id.txtNomEquipo);
        TextView cod = view.findViewById(R.id.txtCod);
        TextView serial = view.findViewById(R.id.txtSerial);
        ImageView img = view.findViewById(R.id.imgFoto);

        Equipo eq = equipos.get(position);
        nomEquipo.setText(eq.getNombre());
        cod.setText(Long.toString(eq.getCodigo()));
        serial.setText(Long.toString(eq.getSerial()));

        Picasso.get()
                .load(eq.getFoto())
                .resize(250,250)
                .into(img);

        return view;
    }
}

package co.edu.uts.sistemas.lista_equipos_hernandezbustos_anamilena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ListarEquiposActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_equipos);
        cargarLista();
    }

    private void cargarLista(){
        ListView list = findViewById(R.id.listaEquipos);
        EquipoAdapter adapter = new EquipoAdapter(getApplicationContext(), Info.EQUIPOS);

        list.setAdapter(adapter);
    }

    public void volver(View view) {
        finish();
    }
}
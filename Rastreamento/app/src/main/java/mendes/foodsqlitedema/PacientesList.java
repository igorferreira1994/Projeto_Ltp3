package mendes.foodsqlitedema;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by igor on 01/05/17.
 */

public class PacientesList extends AppCompatActivity {

    GridView gridView;
    ArrayList<Pacientes> list;
    PacientesListAdapter adapter = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paciente_list_activity);

        gridView = (GridView)findViewById(R.id.gridView);

        list = new ArrayList<>();
        adapter = new PacientesListAdapter(this,R.layout.paciente_items,list);
        gridView.setAdapter(adapter);


        Cursor cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM pacientes");
        list.clear();

        while(cursor.moveToNext()){
            int id = cursor.getInt(0);
            String nome = cursor.getString(1);
            String data = cursor.getString(2);
            String telefone = cursor.getString(3);
            String custo = cursor.getString(4);
            String ambulatorio = cursor.getString(5);
            String doenca = cursor.getString(6);
            String sintomas = cursor.getString(7);
            String medicacao = cursor.getString(8);
            String conclusao = cursor.getString(9);

            list.add(new Pacientes(id, nome, data,telefone,custo,ambulatorio,doenca,sintomas,medicacao,conclusao));
        }
        adapter.notifyDataSetChanged();
    }
}

package mendes.foodsqlitedema;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class PacienteList2 extends AppCompatActivity {

    GridView gridView;
    ArrayList<Pacientes> list;
    PacientesListAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_list2);

        gridView = (GridView)findViewById(R.id.gridView2);

        list = new ArrayList<>();
        adapter = new PacientesListAdapter(this,R.layout.paciente_items,list);
        gridView.setAdapter(adapter);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();

        String nomeP = params.getString("nomexx");
        String dataP = params.getString("dataxx");
            Cursor cursor = MainActivity.sqLiteHelper.getData("");


        if(!(nomeP.isEmpty())){
            if(!(dataP.isEmpty())){
                cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM pacientes WHERE nome = '"+nomeP+"' AND data = '"+dataP+"'  ");
            }else
            cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM pacientes WHERE nome = '"+nomeP+"' ");
        }
        else if(!(dataP.isEmpty())){
            cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM pacientes WHERE data = '"+dataP+"' ");
        }
        else{
            cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM pacientes WHERE nome = '' ");
        }

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

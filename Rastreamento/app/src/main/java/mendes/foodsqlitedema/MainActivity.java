package mendes.foodsqlitedema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName,edtData,edtTelefone,edtCusto,edtAmbulatorio,edtDoenca,edtSintomas,edtMedicacao,edtConclusao;
    Button btnAdd, btnList;

    public static SQLiteHelper sqLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        sqLiteHelper = new SQLiteHelper(this, "RastreamentosDB.sqlite", null, 1);
        sqLiteHelper.queryData("CREATE TABLE IF NOT EXISTS pacientes (Id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, data VARCHAR, telefone VARCHAR, custo VARCHAR, ambulatorio VARCHAR, doenca VARCHAR, sintomas VARCHAR, medicacao VARCHAR, conclusao VARCHAR)");

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    sqLiteHelper.insertData(
                            edtName.getText().toString().trim(),
                            edtData.getText().toString().trim(),
                            edtTelefone.getText().toString().trim(),
                            edtCusto.getText().toString().trim(),
                            edtAmbulatorio.getText().toString().trim(),
                            edtDoenca.getText().toString().trim(),
                            edtSintomas.getText().toString().trim(),
                            edtMedicacao.getText().toString().trim(),
                            edtConclusao.getText().toString().trim()

                    );
                    Toast.makeText(getApplicationContext(),"Paciente Adicionado ",Toast.LENGTH_SHORT).show();
                    edtName.setText("");
                    edtData.setText("");
                    edtTelefone.setText("");
                    edtCusto.setText("");
                    edtAmbulatorio.setText("");
                    edtDoenca.setText("");
                    edtMedicacao.setText("");
                    edtSintomas.setText("");
                    edtConclusao.setText("");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
            }
        });
    }

    private void init(){
        edtName = (EditText)findViewById(R.id.edtName);
        edtData = (EditText)findViewById(R.id.edtData);
        edtTelefone = (EditText)findViewById(R.id.edtTelefone);
        edtCusto = (EditText)findViewById(R.id.edtCusto);
        edtAmbulatorio = (EditText)findViewById(R.id.edtAmbulatorio);
        edtDoenca = (EditText)findViewById(R.id.edtDoenca);
        edtSintomas = (EditText)findViewById(R.id.edtSintomas);
        edtMedicacao = (EditText)findViewById(R.id.edtMedicacao);
        edtConclusao = (EditText)findViewById(R.id.edtConclusao);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnList = (Button)findViewById(R.id.btnList);

    }

}

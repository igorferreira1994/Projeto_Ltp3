package mendes.foodsqlitedema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PacientesPesquisa extends AppCompatActivity {

    EditText edtNomes,edtDatas;
    Button btnPesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacientes_pesquisa);
        init();
        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PacientesPesquisa.this, PacienteList2.class);

                Bundle params = new Bundle();

                params.putString("nomexx", edtNomes.getText().toString());
                params.putString("dataxx", edtDatas.getText().toString());

                intent.putExtras(params);

                startActivity(intent);
            }
        });

    }

    private void init() {

        edtNomes = (EditText)findViewById(R.id.edtNomeP);
        edtDatas = (EditText)findViewById(R.id.edtDataP);
        btnPesquisar = (Button)findViewById(R.id.btnPesquisar);

    }
}

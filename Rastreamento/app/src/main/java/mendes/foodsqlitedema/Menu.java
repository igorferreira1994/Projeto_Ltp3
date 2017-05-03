package mendes.foodsqlitedema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btnAdd,btnCon,btnLis,btnSob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();

        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, PacientesPesquisa.class);
                startActivity(intent);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnLis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, PacientesList.class);
                startActivity(intent);
            }
        });

        btnSob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Sobre.class);
                startActivity(intent);
            }
        });

    }

    private void init() {

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnCon = (Button)findViewById(R.id.btnCon);
        btnLis = (Button)findViewById(R.id.btnLis);
        btnSob = (Button)findViewById(R.id.btnSob);
    }
}

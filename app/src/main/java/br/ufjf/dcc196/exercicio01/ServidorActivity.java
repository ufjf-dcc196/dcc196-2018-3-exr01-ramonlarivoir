package br.ufjf.dcc196.exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ServidorActivity extends AppCompatActivity {

    private EditText edtNomeServidor;
    private EditText edtSiapeServidor;
    private Button btnCadastroServidor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);

        edtNomeServidor = (EditText) findViewById(R.id.edt_nome_servidor);
        edtSiapeServidor = (EditText) findViewById(R.id.edt_siape_servidor);
        btnCadastroServidor = (Button) findViewById(R.id.btn_cadastro_servidor);

        btnCadastroServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultadoServidor = new Intent();
                resultadoServidor.putExtra(MainActivity.PESSOA_NOME, edtNomeServidor.getText().toString());
                resultadoServidor.putExtra(MainActivity.PESSOA_EXTRA, edtSiapeServidor.getText().toString());
                setResult(Activity.RESULT_OK, resultadoServidor);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(), "Olá Servidor!", Toast.LENGTH_SHORT).show();
    }
}

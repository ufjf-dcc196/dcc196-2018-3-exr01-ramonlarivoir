package br.ufjf.dcc196.exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExternoActivity extends AppCompatActivity {

    private EditText edtNomeExterno;
    private EditText edtEmailExterno;
    private Button btnCadastroExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);

        edtNomeExterno = (EditText) findViewById(R.id.edt_nome_externo);
        edtEmailExterno = (EditText) findViewById(R.id.edt_email_externo);
        btnCadastroExterno = (Button) findViewById(R.id.btn_cadastro_externo);

        btnCadastroExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultadoExterno = new Intent();
                resultadoExterno.putExtra(MainActivity.EXTERNO_NOME, edtNomeExterno.getText().toString());
                resultadoExterno.putExtra(MainActivity.EXTERNO_EMAIL, edtEmailExterno.getText().toString());
                setResult(Activity.RESULT_OK, resultadoExterno);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(), "Olá Externo!", Toast.LENGTH_SHORT).show();
    }
}

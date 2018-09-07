package br.ufjf.dcc196.exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlunoActivity extends AppCompatActivity {

    private EditText edtNomeAluno;
    private EditText edtMatriculaAluno;
    private Button btnCadastroAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        edtNomeAluno = (EditText) findViewById(R.id.edt_nome_aluno);
        edtMatriculaAluno = (EditText) findViewById(R.id.edt_matricula_aluno);
        btnCadastroAluno = (Button) findViewById(R.id.btn_cadastro_aluno);

        btnCadastroAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultadoAluno = new Intent();
                resultadoAluno.putExtra(MainActivity.PESSOA_NOME, edtNomeAluno.getText().toString());
                resultadoAluno.putExtra(MainActivity.PESSOA_EXTRA, edtMatriculaAluno.getText().toString());
                setResult(Activity.RESULT_OK, resultadoAluno);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(), "Olá aluno!", Toast.LENGTH_SHORT).show();
    }
}

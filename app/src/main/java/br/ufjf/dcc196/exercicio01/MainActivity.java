package br.ufjf.dcc196.exercicio01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String PESSOA_NOME = "nome";
    public static final String PESSOA_EXTRA = "extra";
    public static final int ALUNO_ID = 1;
    public static final int SERVIDOR_ID = 2;
    public static final int EXTERNO_ID = 3;

    private Button btnAluno;
    private Button btnServidor;
    private Button btnExterno;
    private HashMap<String, String> alunos;
    private HashMap<String, String> servidores;
    private HashMap<String, String> externos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAluno = (Button) findViewById(R.id.btn_aluno);
        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAluno = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intentAluno, MainActivity.ALUNO_ID);
            }
        });

        btnServidor = (Button) findViewById(R.id.btn_servidor);
        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentServidor = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intentServidor, MainActivity.SERVIDOR_ID);
            }
        });

        btnExterno = (Button) findViewById(R.id.btn_externo);
        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentExterno = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intentExterno, MainActivity.EXTERNO_ID);
            }
        });
    }
}

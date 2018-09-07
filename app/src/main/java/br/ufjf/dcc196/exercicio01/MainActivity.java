package br.ufjf.dcc196.exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String ALUNO_NOME = "aluno";
    public static final String ALUNO_MATRICULA = "matricula";
    public static final String SERVIDOR_NOME = "servidor";
    public static final String SERVIDOR_SIAPE = "siape";
    public static final String EXTERNO_NOME = "externo";
    public static final String EXTERNO_EMAIL = "email";
    public static final int REQUEST_ALUNO = 1;
    public static final int REQUEST_SERVIDOR = 2;
    public static final int REQUEST_EXTERNO = 3;

    private Button btnAluno;
    private Button btnServidor;
    private Button btnExterno;
    private TextView txtQtdAluno;
    private TextView txtQtdServidor;
    private TextView txtQtdExterno;
    private HashMap<String, String> alunos;
    private HashMap<String, String> servidores;
    private HashMap<String, String> externos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alunos = new HashMap<>();
        servidores = new HashMap<>();
        externos = new HashMap<>();

        txtQtdAluno = (TextView) findViewById(R.id.txt_qtd_aluno);
        btnAluno = (Button) findViewById(R.id.btn_aluno);
        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAluno = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intentAluno, MainActivity.REQUEST_ALUNO);
            }
        });

        txtQtdServidor = (TextView) findViewById(R.id.txt_qtd_servidor);
        btnServidor = (Button) findViewById(R.id.btn_servidor);
        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentServidor = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intentServidor, MainActivity.REQUEST_SERVIDOR);
            }
        });

        txtQtdExterno = (TextView) findViewById(R.id.txt_qtd_externo);
        btnExterno = (Button) findViewById(R.id.btn_externo);
        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentExterno = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intentExterno, MainActivity.REQUEST_EXTERNO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == MainActivity.REQUEST_ALUNO && resultCode == Activity.RESULT_OK && data != null) {
            Bundle bundleResultadoAluno = data.getExtras();
            String nomeAluno = bundleResultadoAluno.getString(MainActivity.ALUNO_NOME);
            String matriculaAluno = bundleResultadoAluno.getString(MainActivity.ALUNO_MATRICULA);
            alunos.put(matriculaAluno, nomeAluno);

            txtQtdAluno.setText("Total de alunos cadastrados: " + alunos.size());
        }

        if (requestCode == MainActivity.REQUEST_SERVIDOR && requestCode == Activity.RESULT_OK && data != null) {
            Bundle bundleResultadoServidor = data.getExtras();
            String nomeServidor = bundleResultadoServidor.getString(MainActivity.SERVIDOR_NOME);
            String siapeServidor = bundleResultadoServidor.getString(MainActivity.SERVIDOR_SIAPE);
            servidores.put(siapeServidor, nomeServidor);

            txtQtdServidor.setText("Total de servidores cadastrados: " + servidores.size());
        }
    }
}

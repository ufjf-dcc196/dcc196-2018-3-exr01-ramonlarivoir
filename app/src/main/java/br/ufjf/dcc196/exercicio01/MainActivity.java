package br.ufjf.dcc196.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int ALUNO_QTD = 0;
    public static final int SERVIDOR_QTD = 0;
    public static final int EXTERNO_QTD = 0;

    private Button btnAluno;
    private Button btnServidor;
    private Button btnExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAluno = (Button) findViewById(R.id.btn_aluno);
        btnExterno = (Button) findViewById(R.id.btn_externo);
        btnServidor = (Button) findViewById(R.id.btn_servidor);
    }
}

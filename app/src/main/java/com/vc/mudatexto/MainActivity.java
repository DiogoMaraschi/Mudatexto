package com.vc.mudatexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textoApresentacao;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoApresentacao = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

    }
    public void alteraTexto (View v){
        textoApresentacao.setText(editText.getText());
    }

  /*  public void mudaTexto (View view){
        Button button = (Button) view;
        button.setText("o botao foi clicado");
    }*/

}

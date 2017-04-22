package br.com.amelotti.trabalhosm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_cadastro extends AppCompatActivity {

    EditText nomeTxt;
    EditText DtNascimento;
    EditText emailTxt;
    EditText telefoneTxt;
    Button bt_Enviar;
    Button bt_VoltarCD;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomeTxt = (EditText) findViewById(R.id.editNome);
        DtNascimento = (EditText) findViewById(R.id.editDataN);
        emailTxt = (EditText) findViewById(R.id.editEmail);
        telefoneTxt = (EditText) findViewById(R.id.editTel);
        bt_Enviar = (Button) findViewById(R.id.btnEnviar);
        bt_VoltarCD = (Button) findViewById(R.id.btnVoltarCD);

        bt_VoltarCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        bt_Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String v_nome = nomeTxt.getText().toString();
                String v_nascimento = DtNascimento.getText().toString();
                String v_telefone = telefoneTxt.getText().toString();
                String v_email = emailTxt.getText().toString();

                if (v_nome.isEmpty() || v_nascimento.isEmpty() || v_email.isEmpty() || v_telefone.isEmpty()){

                    Toast.makeText(getApplication()," Campos Vazio", Toast.LENGTH_SHORT).show();

                } else {

                    Intent it = new Intent(Activity_cadastro.this, Activity_saida.class);
                    Bundle params = new Bundle();

                    params.putString("nome", nomeTxt.getText().toString());
                    params.putString("nascimento", DtNascimento.getText().toString());
                    params.putString("email", emailTxt.getText().toString());
                    params.putString("telefone", telefoneTxt.getText().toString());
                    it.putExtras(params);
                    startActivity(it);

                }

            }
        });







    }
}

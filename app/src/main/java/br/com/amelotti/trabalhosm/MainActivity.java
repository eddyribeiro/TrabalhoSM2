package br.com.amelotti.trabalhosm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public ListView lista;
    static final String[] menu = new String[]{
            "Calculadora Simples",
            "Calculadora 2º Grau",
            "Cadastro",
            "Sair"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter <String> meuAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, menu

        );
        lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(meuAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicao, long id) {
                String  itemSelecionado = (String) lista.getItemAtPosition(posicao);
                switch (itemSelecionado){

                    case "Calculadora Simples":

                        Intent navCS = new Intent(MainActivity.this, Activity_CS.class );
                        startActivity(navCS);
                        break;
                    case "Calculadora 2º Grau":
                        Intent navSG = new Intent(MainActivity.this, Activity_calcSG.class );
                        startActivity(navSG);
                        break;
                    case "Cadastro":
                        Intent navCadastro = new Intent(MainActivity.this, Activity_cadastro.class );
                        startActivity(navCadastro);
                        break;
                    case"Sair":
                        finish();
                        break;
                }



            }
        });

    }


}

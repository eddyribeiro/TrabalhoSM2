package br.com.amelotti.trabalhosm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static br.com.amelotti.trabalhosm.R.id.resultado;

public class Activity_CS extends AppCompatActivity  {
    TextView resultadoTXT;
    TextView operacaoTXT;
    EditText valorTXT;
    EditText valor2TXT;
    Button bt_Multiplicar;
    Button bt_Dividir;
    Button bt_Somar;
    Button bt_Subtrair;
    Button bt_Igual;
    Button bt_Voltar;
    Integer valor1 =null;
    Integer valor2 =null;
    String operador;
    String aviso = "Informe os dois números";
    String aviso2 = "Informe o operador";
    Integer total=0;
    Button bt_CE;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcsimples);

        resultadoTXT = (TextView) findViewById(resultado);
        valorTXT = (EditText) findViewById(R.id.editValor);
        bt_Multiplicar = (Button) findViewById(R.id.btnMultiplicar);
        bt_Dividir= (Button) findViewById(R.id.btnDividir);
        bt_Somar= (Button) findViewById(R.id.btnSoma);
        bt_Subtrair = (Button) findViewById(R.id.btnSubtrair);
        bt_Igual = (Button) findViewById(R.id.btnCalcular);
        bt_Voltar = (Button) findViewById(R.id.btnVoltarCS);
        bt_CE = (Button) findViewById(R.id.btnCE);
        operacaoTXT = (TextView) findViewById(R.id.operacaoTXT);
        valor2TXT = (EditText) findViewById(R.id.editValor2);


        bt_Multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador="";
                operacaoTXT.setText("");
                String v_1 = valorTXT.getText().toString();
                String v_2= valor2TXT.getText().toString();

                if (v_1.isEmpty() || v_2.isEmpty()){

                    resultadoTXT.setText(aviso);


                }else {
                    operador = "*";
                    operacaoTXT.setText("*");
                }



            }
        });


        bt_Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador="";
                operacaoTXT.setText("");
                String v_1 = valorTXT.getText().toString();
                String v_2= valor2TXT.getText().toString();

                if (v_1.isEmpty() || v_2.isEmpty()){

                    resultadoTXT.setText(aviso);


                }else {
                    operador = "/";
                    operacaoTXT.setText("/");
                }
            }
        });

        bt_Somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador="";
                operacaoTXT.setText("");
                String v_1 = valorTXT.getText().toString();
                String v_2= valor2TXT.getText().toString();

                if (v_1.isEmpty() || v_2.isEmpty()){

                    resultadoTXT.setText(aviso);


                }else {
                    operador = "+";
                    operacaoTXT.setText("+");
                }

            }
        });

        bt_Subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador="";
                operacaoTXT.setText("");
                String v_1 = valorTXT.getText().toString();
                String v_2= valor2TXT.getText().toString();

                if (v_1.isEmpty() || v_2.isEmpty()){

                    resultadoTXT.setText(aviso);


                }else {
                    operador = "-";
                    operacaoTXT.setText("-");
                }

            }
        });

        bt_Igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String v_1 = valorTXT.getText().toString();
                String v_2 = valor2TXT.getText().toString();

                if(v_1.isEmpty() || v_2.isEmpty()) resultadoTXT.setText(aviso);
                else if (operador==null) resultadoTXT.setText(aviso2);
                else {

                        switch (operador) {
                            case "*":
                                total = Integer.parseInt(v_1) * Integer.parseInt(v_2);
                                resultadoTXT.setText(total.toString());
                                break;
                            case "/":
                                total = Integer.parseInt(v_1) / Integer.parseInt(v_2);
                                resultadoTXT.setText(total.toString());
                                break;
                            case "-":
                                total = Integer.parseInt(v_1) - Integer.parseInt(v_2);
                                resultadoTXT.setText(total.toString());
                                break;
                            case "+":
                                total = Integer.parseInt(v_1) + Integer.parseInt(v_2);
                                resultadoTXT.setText(total.toString());
                                break;


                        }


                    }


                }

        });

        bt_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valorTXT.setText("");
                valor2TXT.setText("");
                resultadoTXT.setText("");
                operacaoTXT.setText("");
                operador = null;

            }
        });

        bt_Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });






    }
}

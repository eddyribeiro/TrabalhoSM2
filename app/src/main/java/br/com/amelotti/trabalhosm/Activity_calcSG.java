package br.com.amelotti.trabalhosm;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_calcSG extends AppCompatActivity {

    EditText    valor_A;
    EditText    valor_B;
    EditText    valor_C;
    Button      bt_Calcular;
    Button      bt_Voltar;
    Button      bt_geraEquacao;
    Button      bt_Apagar;
    TextView    solucao1;
    TextView    solucao2;
    TextView    solucao3;
    TextView    solucao4;
    TextView    solucao5;
    TextView    solucao6;
    TextView    solucao7;
    TextView    solucao8;
    TextView    equacao1;
    TextView    equacao2;
    TextView    equacao3;
    TextView    equacao4;
    TextView    equacao5;
    TextView    equacao6;
    TextView    equacao7;
    TextView    equacao8;


    Double solucao_1_X1;
    Double solucao_2_X1;
    Double solucao_3_X1;
    Double solucao_4_X1;
    Double solucao_5_X1;
    Double solucao_6_X1;
    Double solucao_7_X1;
    Double solucao_8_X1;
    Double solucao_1_X2;
    Double solucao_2_X2;
    Double solucao_3_X2;
    Double solucao_4_X2;
    Double solucao_5_X2;
    Double solucao_6_X2;
    Double solucao_7_X2;
    Double solucao_8_X2;







    String texto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcsegundo);

        valor_A = (EditText) findViewById(R.id.editValorA);
        valor_B = (EditText) findViewById(R.id.editValorB);
        valor_C = (EditText) findViewById(R.id.editValorC);
        bt_Calcular = (Button) findViewById(R.id.btnCalcularSG);
        bt_Voltar = (Button) findViewById(R.id.btnVoltarSG);
        bt_geraEquacao = (Button) findViewById(R.id.btnGerarEquacoes);
        bt_Apagar = (Button) findViewById(R.id.btnApagarSG);
        solucao1 = (TextView) findViewById(R.id.solucao1Txt);
        solucao2 = (TextView) findViewById(R.id.solucao2Txt);
        solucao3 = (TextView) findViewById(R.id.solucao3Txt);
        solucao4 = (TextView) findViewById(R.id.solucao4Txt);
        solucao5 = (TextView) findViewById(R.id.solucao5Txt);
        solucao6 = (TextView) findViewById(R.id.solucao6Txt);
        solucao7 = (TextView) findViewById(R.id.solucao7Txt);
        solucao8 = (TextView) findViewById(R.id.solucao8Txt);
        equacao1 = (TextView) findViewById(R.id.equacao1Txt);
        equacao2 = (TextView) findViewById(R.id.equacao2Txt);
        equacao3 = (TextView) findViewById(R.id.equacao3Txt);
        equacao4 = (TextView) findViewById(R.id.equacao4Txt);
        equacao5 = (TextView) findViewById(R.id.equacao5Txt);
        equacao6 = (TextView) findViewById(R.id.equacao6Txt);
        equacao7 = (TextView) findViewById(R.id.equacao7Txt);
        equacao8 = (TextView) findViewById(R.id.equacao8Txt);

        bt_Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bt_Apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valor_A.setText("");
                valor_B.setText("");
                valor_C.setText("");
                solucao1.setText("");
                        solucao2.setText("");
                solucao3.setText("");
                        solucao4.setText("");
                solucao5.setText("");
                        solucao6.setText("");
                solucao7.setText("");
                        solucao8.setText("");
                equacao1.setText("");
                        equacao2.setText("");
                equacao3.setText("");
                        equacao4.setText("");
                equacao5.setText("");
                        equacao6.setText("");
                equacao7.setText("");
                        equacao8.setText("");





            }
        });

        bt_geraEquacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String validaA = valor_A.getText().toString();
                String validaB = valor_B.getText().toString();
                String validaC = valor_C.getText().toString();

                if(validaA.isEmpty() || validaB.isEmpty() || validaC.isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Por favor Preencher todos os campos", Toast.LENGTH_SHORT).show();


                }else {


                Integer A = Integer.parseInt(valor_A.getText().toString());
                Integer B = Integer.parseInt(valor_B.getText().toString());
                Integer C = Integer.parseInt(valor_C.getText().toString());


                    if (B == 0) {

                        B = 1;
                    }


                    if (A == 0 || A < 0) {

                        Toast.makeText(getApplicationContext(), "Valor de 'A' Deve ser maior que zero", Toast.LENGTH_SHORT).show();
                        valor_A.setText(null);
                        valor_B.setText(null);
                        valor_C.setText(null);



                    } else {

                        equacao1.setText("Equação 1:   "+A+"X + "+B+"X - "+C+" = 0");
                        equacao2.setText("Equação 2:   "+A+"X - "+B+"X + "+C+" = 0");
                        equacao3.setText("Equação 3:   "+A+"X + "+B+"X + "+C+" = 0");
                        equacao4.setText("Equação 4:   "+A+"X - "+B+"X - "+C+" = 0");
                        equacao5.setText("Equação 5:   "+A+"X + "+B+"X = 0");
                        equacao6.setText("Equação 6:   "+A+"X - "+B+"X = 0");
                        equacao7.setText("Equação 7:   "+A+"X - "+C+" = 0");
                        equacao8.setText("Equação 8:   "+A+"X + "+C+" = 0");



                    }

                }

            }
        });





        bt_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String validaA = valor_A.getText().toString();
                String validaB = valor_B.getText().toString();
                String validaC = valor_C.getText().toString();


                if(validaA.isEmpty() || validaB.isEmpty() || validaC.isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Por favor Preencher todos os campos", Toast.LENGTH_SHORT).show();


                }else {


                    Integer A = Integer.parseInt(valor_A.getText().toString());
                    Integer B = Integer.parseInt(valor_B.getText().toString());
                    Integer C = Integer.parseInt(valor_C.getText().toString());


                    if (B == 0) {

                        B = 1;
                    }


                    if (A == 0 || A < 0){

                        Toast.makeText(getApplicationContext(), "Valor de 'A' Deve ser maior que zero", Toast.LENGTH_SHORT).show();
                        valor_A.setText(null);
                        valor_B.setText(null);
                        valor_C.setText(null);



                    } else {

                        //equação1



                        solucao_1_X1 = baskaraX1(A, B, -C);
                        solucao_1_X2 = baskaraX2(A, B, -C);


                        Integer x1Convertido = solucao_1_X1.intValue();
                        Integer x2Convertido = solucao_1_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao1.setText(texto.toString());

                        //equação2



                        solucao_2_X1 = baskaraX1(A, -B, C);
                        solucao_2_X2 = baskaraX2(A, -B, C);


                        x1Convertido = solucao_2_X1.intValue();
                        x2Convertido = solucao_2_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao2.setText(texto.toString());

                        //equação3



                        solucao_3_X1 = baskaraX1(A, B, C);
                        solucao_3_X2 = baskaraX2(A, B, C);


                        x1Convertido = solucao_3_X1.intValue();
                        x2Convertido = solucao_3_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao3.setText(texto.toString());
                        //equação4



                        solucao_4_X1 = baskaraX1(A, -B, -C);
                        solucao_4_X2 = baskaraX2(A, -B, -C);


                         x1Convertido = solucao_4_X1.intValue();
                        x2Convertido = solucao_4_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao4.setText(texto.toString());
                        //equação5


                        C = 0;
                        solucao_5_X1 = baskaraX1(A, B, C);
                        solucao_5_X2 = baskaraX2(A, B, C);


                        x1Convertido = solucao_5_X1.intValue();
                        x2Convertido = solucao_5_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao5.setText(texto.toString());

                        //equação6


                        C = 0;
                        solucao_6_X1 = baskaraX1(A, -B, C);
                        solucao_6_X2 = baskaraX2(A, -B, C);


                        x1Convertido = solucao_6_X1.intValue();
                        x2Convertido = solucao_6_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao6.setText(texto.toString());

                        //equação7

                        C = Integer.parseInt(valor_C.getText().toString());
                        B = 0;
                        solucao_7_X1 = baskaraX1(A, B, -C);
                        solucao_7_X2 = baskaraX2(A, B, -C);


                        x1Convertido = solucao_7_X1.intValue();
                        x2Convertido = solucao_7_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao7.setText(texto.toString());

                        //equação8


                        B = 0;
                        solucao_8_X1 = baskaraX1(A, B, C);
                        solucao_8_X2 = baskaraX2(A, B, C);


                        x1Convertido = solucao_8_X1.intValue();
                        x2Convertido = solucao_8_X2.intValue();

                        texto = "Solução: { "+x1Convertido+" , "+x2Convertido+" }";

                        solucao8.setText(texto.toString());




                    }

                }

            }
        });




    }

    private Double baskaraX1(int a, int b, int c) {
        Double resultado;
        Integer delta;
        Double raiz;



        delta = ((b)*(b)) - 4 * a * c ;
        raiz = Math.sqrt(delta);


        resultado = (-b + raiz) / (2.0*a);


        return resultado;
    }

    private Double baskaraX2(int a, int b, int c) {
        Double resultado;
        Integer delta;
        Double raiz;



        delta = (b*b) - 4 * a * c ;
        raiz = Math.sqrt(delta);


        resultado = (-b - raiz) / (2.0*a);


        return resultado;
    }






    }


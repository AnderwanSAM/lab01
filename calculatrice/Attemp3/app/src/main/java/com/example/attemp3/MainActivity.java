package com.example.attemp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 ,
            btnAdd, btnClear, btnMinus, btnMultiply, btnDivide, btnEquals, btnDot;
    private TextView resultEdit, resume;

    float valeur1, valeur2, valeurAcc;
    boolean add, minus, multiply, divide, equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)  findViewById(R.id.btn00);
        btn1 = (Button)  findViewById(R.id.btn01);
        btn2 = (Button)  findViewById(R.id.btn02);
        btn3 = (Button)  findViewById(R.id.btn03);
        btn4 = (Button)  findViewById(R.id.btn04);
        btn5 = (Button)  findViewById(R.id.btn05);
        btn6 = (Button)  findViewById(R.id.btn06);
        btn7 = (Button)  findViewById(R.id.btn07);
        btn8 = (Button)  findViewById(R.id.btn08);
        btn9 = (Button)  findViewById(R.id.btn09);
        btnClear = (Button)  findViewById(R.id.btnClear);
        btnAdd = (Button)  findViewById(R.id.btnAdd);
        btnMinus = (Button)  findViewById(R.id.btnMinus);
        btnMultiply = (Button)  findViewById(R.id.btnMultiply);
        btnDivide = (Button)  findViewById(R.id.btnDivide);
        btnDot = (Button)  findViewById(R.id.btnDot);
        btnEquals = (Button)  findViewById(R.id.btnEquals);

        resultEdit = (TextView) findViewById(R.id.resultEdit);
        resume = (TextView) findViewById(R.id.Resume);

                btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + "9");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valeur1 = Float.NaN;
                valeur2 = Float.NaN;
                resultEdit.setText(null);
                resume.setText(null);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEdit.setText(resultEdit.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultEdit == null)
                    resultEdit.setText(null);

                valeur1 = Float.parseFloat(resultEdit.getText() + "");

                add= true;
                resultEdit.setText(null);
                resume.setText( valeur1 + "+");
            }

        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultEdit == null)
                    resultEdit.setText(null);

                valeur1 = Float.parseFloat(resultEdit.getText() + "");

                minus= true;
                resultEdit.setText(null);
                resume.setText( valeur1 + "-");
            }

        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultEdit == null)
                    resultEdit.setText(null);

                valeur1 = Float.parseFloat(resultEdit.getText() + "");

                multiply= true;
                resultEdit.setText(null);
                resume.setText( valeur1 + "*");
            }

        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultEdit == null)
                    resultEdit.setText(null);

                valeur1 = Float.parseFloat(resultEdit.getText() + "");

                divide= true;
                resultEdit.setText(null);
                resume.setText( valeur1 + "/");
            }

        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                equals = true;
                try{
                    valeur2 = Float.parseFloat(resultEdit.getText() + "");}
                catch(NumberFormatException e){
                    resume.setText("An Error Occured");
                }


                if(add){
                    resultEdit.setText((valeur1 + valeur2) + " ");
                    valeurAcc = valeur1 + valeur2;
                    resume.setText(valeur1+"+"+ valeur2 );
                    add = false;
                }else if (minus){
                    resultEdit.setText((valeur1 - valeur2) + " ");
                    resume.setText( valeur1 + "-" + valeur2 );
                    valeurAcc = valeur1 - valeur2;
                    minus = false;
                }else if(multiply){
                    resultEdit.setText((valeur1*valeur2) +" ");
                    resume.setText( valeur1 + "*" + valeur2 );
                    valeurAcc = valeur1*valeur2;
                    multiply = false;
                }else if(divide){
                    resultEdit.setText((valeur1/valeur2)+ " ");
                    resume.setText( valeur1 + "/" + valeur2 );
                    valeurAcc = valeur1/valeur2;
                    divide = false;
                }else
                    resultEdit.setText("An Error occured");
            }
        });

        }

    }

package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText textbox1, textbox2;
    TextView resultado;
    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textbox1 = findViewById(R.id.editValue1);
        textbox2 = findViewById(R.id.editValue2);

        resultado = findViewById(R.id.result);
    }

    public void onClick(View view) {

        num1 = Integer.parseInt(textbox1.getText().toString());
        num2 = Integer.parseInt(textbox2.getText().toString());

        switch (view.getId()){

            case R.id.btnRestar:
                int resta = num1 - num2;
                String str_resta = getResources().getString(R.string.lbl_resultado);
                resultado.setText((str_resta + resta));
                break;

            case R.id.btnSumar:
                int suma = num1 + num2;
                String str_suma = getResources().getString(R.string.lbl_resultado);
                resultado.setText((str_suma + suma));
                break;

            case R.id.btnMultiplicar:
                int multiplicacion = num1 * num2;
                String str_mult = getResources().getString(R.string.lbl_resultado);
                resultado.setText((str_mult + multiplicacion));
                break;

            case R.id.btnDividir:
                try {
                    int division = num1 / num2;
                    String str_div = getResources().getString(R.string.lbl_resultado);
                    resultado.setText((str_div + division));
                }
                catch (ArithmeticException e){
                    Toast.makeText(getApplicationContext(), "Error, Division por Zero", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}

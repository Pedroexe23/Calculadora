package cl.Inacap.CalculadoraApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText n2Txt;
    private EditText n1Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.n1Txt = findViewById(R.id.N1Txt);
        this.n2Txt = findViewById(R.id.N2Txt);
    }


    public void sumar(View v) {
        double n1 = Integer.parseInt(this.n1Txt.getText().toString());
        double n2 = Integer.parseInt(this.n2Txt.getText().toString());

        if (((n1 + n2) + 1) % 2 == 0) {
            int n3 = (int) +(n1 + n2);
            Toast.makeText(this, "la suma es " + (n3), Toast.LENGTH_SHORT).show();
        } else if (((n1 + n2) + 1) % 3 == 0) {
            int n3 = (int) +(n1 + n2);
            Toast.makeText(this, "La suma es " + (n3), Toast.LENGTH_SHORT).show();
        } else if (((n1 + n2) + 1) % 5 == 0) {
            int n3 = (int) +(n1 + n2);
            Toast.makeText(this, "La suma es " + (n3), Toast.LENGTH_SHORT).show();
        } else if (((n1 + n2) + 1) % 7 == 0) {
            int n3 = (int) +(n1 + n2);
            Toast.makeText(this, "La suma es " + (n3), Toast.LENGTH_SHORT).show();
        } else if (((n1 + n2) + 1) % 9 == 0) {
            int n3 = (int) +(n1 + n2);
            Toast.makeText(this, "La suma es " + (n3), Toast.LENGTH_SHORT).show();
        } else if ((n1 + n2) % 1 == 0) {
            int n3 = (int) +(n1 + n2);
            Toast.makeText(this, "La suma es " + (n3), Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "La suma es " + (n1 + n2), Toast.LENGTH_SHORT).show();
        }

    }

    public void restar(View v) {
        double n1 = Integer.parseInt(this.n1Txt.getText().toString());
        double n2 = Integer.parseInt(this.n2Txt.getText().toString());

        if ((n1 - n2) % 0 == 0) {
            int n3 = (int) +(n1 - n2);
            Toast.makeText(this, "La resta es " + (n3), Toast.LENGTH_SHORT).show();
        } else if ((n1 - n2) % 1 == 0) {
            int n3 = (int) +(n1 - n2);
            Toast.makeText(this, "La resta es " + (n3), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "La resta es " + (n1 - n2), Toast.LENGTH_SHORT).show();
        }


    }

    public void multiplicar(View v) {
        double n1 = Integer.parseInt(this.n1Txt.getText().toString());
        double n2 = Integer.parseInt(this.n2Txt.getText().toString());

        if ((n1 * n2) % 0 == 0) {
            int n3 = (int) +(n1 * n2);
            Toast.makeText(this, "La multiplicacion es " + (n3), Toast.LENGTH_SHORT).show();
        } else if ((n1 + n2) % 1 == 0) {
            int n3 = (int) +(n1 * n2);
            Toast.makeText(this, "La multiplicacion es " + (n3), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "La multiplicacion es " + (n1 * n2), Toast.LENGTH_SHORT).show();
        }

    }

    public void dividir(View v) {
        double n1 = Integer.parseInt(this.n1Txt.getText().toString());
        double n2 = Integer.parseInt(this.n2Txt.getText().toString());

        if ((n1 / n2) % 0 == 0) {
            int n3 = (int) +(n1 / n2);
            Toast.makeText(this, "La division es " + (n3), Toast.LENGTH_SHORT).show();
        } else if ((n1 / n2) % 1 == 0) {
            int n3 = (int) +(n1 / n2);
            Toast.makeText(this, "La division es " + (n3), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "La division es " + (n1 / n2), Toast.LENGTH_SHORT).show();
        }

    }


}
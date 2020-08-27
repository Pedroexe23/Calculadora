package cl.Inacap.CalculadoraApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Saludar(View v){
        Toast.makeText( context:this, Text:"hola pedro", Toast.LENGTH_LONG).show();
    }
}
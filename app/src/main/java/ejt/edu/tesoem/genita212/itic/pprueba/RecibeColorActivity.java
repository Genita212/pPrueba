package ejt.edu.tesoem.genita212.itic.pprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecibeColorActivity extends AppCompatActivity {
    EditText txt;
    Spinner opcion;
    ArrayList<String> addArray = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_color);
        opcion=(Spinner)findViewById(R.id.muestraColor);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(RecibeColorActivity.this, android.R.layout.simple_spinner_dropdown_item, addArray);
        opcion.setAdapter(adapter);
        opcion.setPrompt("Muestra las opciones");

        String getInput = txt.getText().toString();
            addArray.add(getInput);
            ((EditText)findViewById(R.id.txtColor)).setText("");
    }
}

package ejt.edu.tesoem.genita212.itic.pprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txt;
    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(EditText)findViewById(R.id.txtColor);
        save=(Button)findViewById(R.id.btnEnviar);
    }
    public void enviar(View v){
        Intent pantalla=new Intent(this,RecibeColorActivity.class);
        pantalla.putExtra("color",txt.getText().toString());
        startActivity(pantalla);
        this.finish();
    }
}

package developer.android.santos.calculoIMC.view;

import developer.android.santos.calculoIMC.R;
import developer.android.santos.calculoIMC.model.IMC;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    IMC imc;

    String dadosIMC;

    EditText editAltura;
    EditText editPeso;

    Button btn_Calcular;
    Button btn_Limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imc = new IMC();
        imc.setAltura("1.82");
        imc.setPeso("60.0");

        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);

        btn_Calcular = findViewById(R.id.btn_Calcular);
        btn_Limpar = findViewById(R.id.btn_Limpar);

        editAltura.setText(imc.getAltura());
        editPeso.setText(imc.getPeso());

        btn_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Dados Limpados com sucesso!",Toast.LENGTH_LONG).show();
                editAltura.setText("");
                editPeso.setText("");
            }
        });

    }
}


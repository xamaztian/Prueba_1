package cl.xamaztian.prueba_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Button btnMostrar = findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btnShow = findViewById(R.id.btnMostrar);
                btnShow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String genderText = "";

                        RadioButton btnMen = findViewById(R.id.radioHombre);
                        RadioButton btnWoman = findViewById(R.id.radioMujer);

                        if (btnMen.isChecked())
                            genderText = "Hombre";
                        if (btnWoman.isChecked())
                            genderText = "Mujer";

                        EditText txtName = findViewById(R.id.txtName);
                        EditText txtLastName = findViewById(R.id.txtLastName);

                        if (txtName.getText().toString().isEmpty())
                            Toast.makeText(FormActivity.this, "Debe escribir un Nombre", Toast.LENGTH_SHORT).show();

                        if (txtLastName.getText().toString().isEmpty())
                            Toast.makeText(FormActivity.this, "Debe escribir un Apellido", Toast.LENGTH_SHORT).show();

                        if (genderText.isEmpty())
                            Toast.makeText(FormActivity.this, "Debe seleccionar un género", Toast.LENGTH_SHORT).show();

                        TextView textViewFinalText = findViewById(R.id.textViewFinalText);

                        textViewFinalText.setText("Bienvenido " + txtName.getText().toString() + " " +
                                txtLastName.getText().toString() + ", el género escogido fue " + genderText);

                        textViewFinalText.setVisibility(View.VISIBLE);
                    }
                });
            }
        });
    }
}

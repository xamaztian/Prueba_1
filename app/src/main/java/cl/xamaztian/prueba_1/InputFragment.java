package cl.xamaztian.prueba_1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputFragment extends Fragment {


    public InputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button btnShow = view.findViewById(R.id.btnShow);
        final RadioButton btnMen = (view.findViewById(R.id.radioButtonMan));
        final RadioButton btnWoman = view.findViewById(R.id.radioButtonWoman);
        final EditText txtName = view.findViewById(R.id.txtName);
        final EditText txtLastName = view.findViewById(R.id.txtLastName);
        final TextView textViewFinalText = view.findViewById(R.id.textViewFinalText);
        final RadioGroup radioGroup = view.findViewById(R.id.genderRg);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genderText = "";

                //int selectedId = radioGroup.getCheckedRadioButtonId();
                //if (-1 == selectedId) {

                //} else {
                //    RadioButton selected = radioGroup.findViewById(selectedId);
                //   String gender = selected.getText().toString();
                //}

                genderText = FormValidations.gender(btnMen.isChecked(), btnWoman.isChecked());

                if (txtName.getText().toString().isEmpty())
                    Toast.makeText(getContext(), "Debe escribir un Nombre", Toast.LENGTH_SHORT).show();

                if (txtLastName.getText().toString().isEmpty())
                    Toast.makeText(getContext(), "Debe escribir un Apellido", Toast.LENGTH_SHORT).show();

                if (genderText.isEmpty())
                    Toast.makeText(getContext(), "Debe seleccionar un género", Toast.LENGTH_SHORT).show();

                textViewFinalText.setText("Bienvenido " + txtName.getText().toString() + " " +
                        txtLastName.getText().toString() + ", el género escogido fue " + genderText);

                textViewFinalText.setVisibility(View.VISIBLE);
            }
        });
    }
}

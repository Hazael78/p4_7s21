package mx.edu.isc.tesoem.hjcg.p4_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import DatosParce.DatosParce;

public class PrincipalActivity extends AppCompatActivity{

    Button btnab,btnap;

    EditText txtnombre,txtcorreo,txtedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtnombre = findViewById(R.id.p1txtnombre);
        txtcorreo = findViewById(R.id.p1txtcorreo);
        txtedad = findViewById(R.id.p1txtedad);


        //aqui enlazamos los botones
        btnab = findViewById(R.id.p1btnab);
        btnap = findViewById(R.id.p1btnap);

        //aqui activamos la escucha del click
        btnab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanza = new Intent(PrincipalActivity.this, BasicaActivity.class);
                lanza.putExtra("nombre",txtnombre.getText().toString());
                startActivity(lanza);
            }
        });

        btnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatosParce datosParce = new DatosParce(txtnombre.getText().toString(),txtcorreo.getText().toString(),Integer.parseInt(txtedad.getText().toString()));
                Intent lanza = new Intent(PrincipalActivity.this, ParceActivity.class);
                lanza.putExtra("datosparcelables",datosParce);
                startActivity(lanza);
            }
        });
    }


}
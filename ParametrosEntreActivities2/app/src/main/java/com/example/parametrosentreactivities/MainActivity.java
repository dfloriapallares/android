package com.example.parametrosentreactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.parametrosentreactivities.beans.Usuario;
import com.example.parametrosentreactivities.datos.SeasData;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;
    private EditText edtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = (EditText) findViewById(R.id.edt);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegarEntrePantallas = new Intent(getBaseContext(), MainActivity2.class);

                Usuario miUsuario = new Usuario();
                miUsuario.setEmail(edtUser.getText().toString());

                SeasData.setUsuario(miUsuario);
                startActivity(navegarEntrePantallas);
            }
        });
    }
}
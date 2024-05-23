package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lugaluga.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    private Button buttonLogin;

    private TextInputLayout inputEmail, inputSenha;

    private TextView fazerCadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        inputEmail = findViewById(R.id.inputEmail);
        inputSenha = findViewById(R.id.inputPassword);
        buttonLogin = findViewById(R.id.button);
        fazerCadastro = findViewById(R.id.fazer_cadastro);

        Intent intent = new Intent(this, MainActivity2.class);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                if (validaEmailSenha()){
                    startActivity(intent);
                }
            }
        });

        Intent intentCadastro = new Intent(this, Cadastro_Activity.class);

        fazerCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentCadastro);
            }
        });
    }

    public boolean validaEmailSenha(){
        if(inputEmail.getEditText() != null
                && inputEmail.getEditText().getText().toString().equals("")){
            inputEmail.setError("Informe o email");
            return false;
        }
        if(inputSenha.getEditText() != null
                && inputSenha.getEditText().getText().toString().equals("")){
            inputSenha.setError("Informe a senha");
            return false;
        }
        return true;
    }

}
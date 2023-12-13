package com.example.autentication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Verifica se o email e a senha são válidos (simulação básica)
                if (email.endsWith("@gmail.com") && password.equals("buble")) {
                    Toast.makeText(MainActivity.this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show();
                    editTextEmail.setText("");
                    editTextPassword.setText("");
                    // Aqui você pode redirecionar para outra atividade ou fazer outra ação após o login
                } else {
                    Toast.makeText(MainActivity.this, "Credenciais inválidas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

package com.example.apppoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;


public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
    }

    public void cadastrarUsuario(View v) throws IOException {
        EditText campoEmail = findViewById(R.id.emailCampo2);
        String email = campoEmail.getText().toString();
        EditText campoNome = findViewById(R.id.nomeCampo);
        String nome = campoNome.getText().toString();
        EditText campoSenha = findViewById(R.id.senhaCampo2);
        String senha = campoSenha.getText().toString();
        EditText confirmSenha = findViewById(R.id.confirmSenhaCampo);
        String confirmarSenha = confirmSenha.getText().toString();
        int resposta = DBHelper.insertIntoUsuario(nome, email, senha);
        if (resposta == 1) {
            Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, TerceiraTela.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Erro! Cadastro não realizado!", Toast.LENGTH_LONG).show();
        }
    }
}

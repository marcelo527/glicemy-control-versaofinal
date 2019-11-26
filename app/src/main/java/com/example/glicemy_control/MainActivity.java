package com.example.apppoo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vaiParaCadatro(View v) {
        Intent intent = new Intent(this, com.example.apppoo.SegundaTela.class);
        startActivity(intent);
    }

    public void confereLogin(View v) throws IOException, JSONException {
        EditText campoEmail = findViewById(R.id.emailCampo);
        String emailDigitado = campoEmail.getText().toString();
        EditText campoSenha = findViewById(R.id.senhaCampo);
        String senhaDigitada = campoSenha.getText().toString();
        JSONArray todosOsUsuarios = DBHelper.selectAllFromUsuario();
        boolean encontrou = false;
        for (int i = 0; i < todosOsUsuarios.length(); i++) {
            JSONObject usuario = todosOsUsuarios.getJSONObject(i);
            String email = usuario.getString("email");
            String senha = usuario.getString("senha");
            if (email.equals(emailDigitado) && senha.equals(senhaDigitada)) {
                encontrou = true;
                String nome = usuario.getString("nome");
                Intent intent = new Intent(this, TerceiraTela.class);
                Bundle bundle = new Bundle();
                bundle.putString("email", email);
                bundle.putString("nome", nome);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
        if (!encontrou) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Erro no Login!");
            builder.setMessage("Usuário não encontrado!");
            builder.setPositiveButton("Ok", null);
            builder.create().show();
        }
    }
}

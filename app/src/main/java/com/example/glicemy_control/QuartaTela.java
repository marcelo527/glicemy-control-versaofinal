package com.example.glicemy_control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QuartaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_tela);
    }
    ArrayList<String> quantidades = new ArrayList<String>();
    alimento.add("um grama");
    alimento.add("dez gramas");
    alimento.add("cem gramas");
    alimento.add("duzentos e cinquenta gramas");

    ListView quantidades = findViewById(R.id.quantidadeList);
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1, quantidades);
quantidadesList.setAdapter(adapter);

intent intent = getIntent();
Bundle bundle = intent.getExtras();
String name = bundle.getString("alimento");
//TextView alimento = (TextView) findViewById(R.id.quantidades)
        alimento.setText(alimento);
    public void vaiParaCalculo(View v) {
    intent intent  = new intent();
    Bundle pacote = new Bundle();
    bundle.putString("alimento", alimento);
    bundle.putString("quantidade", quantidade);
    intent.putExtras(pacote);
    startActivity(intent);
}
}

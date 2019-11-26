package com.example.glicemy_control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TerceiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
    }
    ArrayList<String> alimentos = new ArrayList<String>();
alimento.add(banana);
alimento.add(brigadeiro);
alimento.add(maça);
alimento.add(pera);

ListView alimentos = findViewById(R.id.alimentosList);
ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        this,android.R.layout.simple_list_item_1, alimentos);
alimentosList.setAdapter(adapter);

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

        public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
            if (position == INDEX) {
               alimento = position}
            }
        };
        ListView listView = (ListView) findViewById(R.id.listView_id);
	listView.setOnItemClickListener(itemClickListener);
    }
}
public void vaiParaQuantidade(View v) {
        Intent intent = new Intent(this, QuartaTela.class);
        Bundle bundle = new Bundle();
        bundle.putString("alimento", alimento);
        intent.putExtras(bundle);
        startActivity(intent);
        }

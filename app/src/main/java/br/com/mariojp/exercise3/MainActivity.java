package br.com.mariojp.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Tarefa tarefa;
    ListView lista;
    EditText desc;
    EditText pri;
    Button remove;
    Button add;

    ArrayList<String> arrayList;
    ArrayList<Tarefa> arrayTarefa;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         lista = findViewById(R.id.listView);
         desc = findViewById(R.id.editDescricao);
         pri = findViewById(R.id.editPrioridade);
         remove = findViewById(R.id.buttonRemover);
         add = findViewById(R.id.buttonAdicionar);

         arrayList = new ArrayList<String>();
         adapter = new ArrayAdapter<String>(MainActivity.this,
                 android.R.layout.simple_list_item_1, arrayList);

         lista.setAdapter(adapter);

    }

    public void adicionar(View add){
        String txtDesc = desc.getText().toString();
        String prioridade = pri.getText().toString();
//        int txtPri = Integer.valueOf(pri.getText().toString());
//
//        tarefa = new Tarefa(txtDesc, 1);
//        arrayTarefa.add(tarefa);

        arrayList.add(txtDesc + "\nPrioridade: " + prioridade );
        adapter.notifyDataSetChanged();


    }

    public void remover(View remove){
        arrayList.remove(arrayList.get(0));
        adapter.notifyDataSetChanged();
    }
}

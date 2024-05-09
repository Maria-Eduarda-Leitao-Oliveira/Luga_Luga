package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.R;
import com.example.lugaluga.RecyclerItemClickListener;
import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.AdapterProduto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private AdapterProduto adapterProduto;

    private List<Produto> produtoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        recyclerView = findViewById(R.id.listaProdutos);
        CriarListaProdutos();

        adapterProduto = new AdapterProduto(produtoList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);

recyclerView.addOnItemTouchListener(
        new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(MainActivity.this, ProdutoActivity2.class);
        intent.putExtra("produto",produtoList.get(position));
        startActivity(intent);

    }

    @Override
    public void onLongItemClick(View view, int position) {
        Toast.makeText(getApplicationContext(),produtoList.get(position).getStatus(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}));



    }

    public void CriarListaProdutos(){
        Produto produto;
        produto = new Produto(
                "IPhonev13",
                2000.00,
                "Iphone 13",
                10,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Fone",
                60.00,
                "Apple",
                20,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Computador",
                8000.00,
                "Dell",
                15,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Carregador",
                30.00,
                "Motorola",
                16,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "TV 52 4K",
                1500.00,
                "LG",
                12,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Maquina de lavar roupa",
                5500.00,
                "Electrolux",
                5,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Geladeira",
                2500.00,
                "Electrolux",
                9,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Microondas",
                1500.00,
                "Electrolux",
                10,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Liquidificador",
                350.00,
                "Mondial",
                7,
                "Disponível",
                "Descricao");
        produtoList.add(produto);

        produto = new Produto(
                "Batedeira",
                500.00,
                "Mondial",
                8,
                "Disponível",
                "Descricao");


        produtoList.add(produto);




    }
}
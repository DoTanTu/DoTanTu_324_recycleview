package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    public void initView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Car> arrayList  = new ArrayList<>();
        arrayList.add(new Car(R.drawable.xe1,"Lamborghini Aventador LP White"));
        arrayList.add(new Car(R.drawable.xe2,"LAMBORGHINI GALLARDO LP550-2"));
        arrayList.add(new Car(R.drawable.xe3,"LAMBORGHINI SESTO ELEMENTO"));
        arrayList.add(new Car(R.drawable.xe4,"LAMBORGHINI DIABLO SV"));
        arrayList.add(new Car(R.drawable.xe5,"LAMBORGHINI MIURA P400 SV"));
        arrayList.add(new Car(R.drawable.xe6,"Mercedes-Benz S-Class"));
        arrayList.add(new Car(R.drawable.xe7,"Mercedes-Benz SLS AMG"));
        arrayList.add(new Car(R.drawable.xe8,"Mercedes-AMG GT"));
        CarAdapter phoneAdapter = new CarAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(phoneAdapter);





    }
}
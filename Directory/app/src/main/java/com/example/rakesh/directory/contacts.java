package com.example.rakesh.directory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class contacts extends AppCompatActivity {
    RecyclerView recycler;
    LinearLayoutManager manager;
    Recycler_adapter adapter;
    String name[]={"name1","name2","name3"};
    String address[]={"address1","address2","address3"};
    String website[]={"website1","website2","website3"};
    String phone[] = {"phoen1","phone2","phone3"};
    String email[] = {"email1","email2","email3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Intent intent = getIntent();
        String occupation = intent.getExtras().getString("craft");
        recycler = (RecyclerView)findViewById(R.id.rv3);
        manager=new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(manager);
        adapter = new Recycler_adapter(this,name,phone,email,website,address);
        recycler.setAdapter(adapter);//Add items to the arrays above as and when retrieved from the database
        TextView heading = (TextView) findViewById(R.id.heading);
        heading.setText(occupation);

    }
}

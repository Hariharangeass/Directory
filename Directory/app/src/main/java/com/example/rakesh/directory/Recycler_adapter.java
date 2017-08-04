package com.example.rakesh.directory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rakesh on 3/8/17.
 */

public class Recycler_adapter extends RecyclerView.Adapter<Recycler_adapter.DirectoryViewHolder>{

    Context context;
    String[] name;
    String[] phone;
    String[] email;
    String[] address;
    String[] website;

    Recycler_adapter(Context c,String[] name, String[] phone, String[] email,String[] address,String[] website)
    {
        this.context = c;
        this.name = name;
        this.phone = phone;
        this.email=email;
        this.address=address;
        this.website=website;
    }


    @Override
    public DirectoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_contact_file,parent,false);
        DirectoryViewHolder dvh = new DirectoryViewHolder(row);

        return dvh;
    }

    @Override
    public void onBindViewHolder(DirectoryViewHolder holder, int position) {

        holder.name1.setText(name[position]);
        holder.phone1.setText(phone[position]);
        holder.email1.setText(email[position]);
        holder.website1.setText(website[position]);
        holder.address1.setText(address[position]);

    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public class DirectoryViewHolder extends RecyclerView.ViewHolder{

        TextView name1,address1,email1,website1,phone1;



        public DirectoryViewHolder(View itemView) {
            super(itemView);

            name1 = itemView.findViewById(R.id.name);
            email1 = itemView.findViewById(R.id.email);
            website1 = itemView.findViewById(R.id.website);
            phone1 =itemView.findViewById(R.id.phone);
            address1 = itemView.findViewById(R.id.address);
        }
    }
}



package com.example.testrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
private ArrayList<User> userList;

public RecyclerAdapter(ArrayList<User>usersList)
{
    this.userList=usersList;
}

public class MyViewHolder extends RecyclerView.ViewHolder{
    private TextView nameTxt;

    public MyViewHolder(final View view){
        super(view);
        nameTxt=view.findViewById(R.id.textView2);

    }
}
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
    return new MyViewHolder(itemView);


    //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String name=userList.get(position).getUserName();
        holder.nameTxt.setText(name);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}

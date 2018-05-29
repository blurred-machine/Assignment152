package com.example.paras.assignment_152;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

// my custom adapter class which exteds the RecycleView of type MyViewHolder class created below.
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    // initializing the layoutInflater, context and arraylist of type MyAndroidName.
    private LayoutInflater inflater;
    Context context;
    ArrayList<MyAndroidName> arrayList = new ArrayList<>();

    // constructor of this class which takes the arguments of context and arrylist
    MyAdapter(Context context, ArrayList<MyAndroidName> arrayList){
        // setting the passed values to the vlues defined in this class.
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.arrayList = arrayList;
    }

    // below mentioned three methods are overridden by the RecyclerView.adapter class.

    // in the onCreateViewHolder method we initialize the view holder by inflating the view,
    // with the card layout created.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.cardview_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    // this method binds the data at a specific position to the view holder.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // getting the MyAndroidName value at a position.
        MyAndroidName name = arrayList.get(position);
        // setting the text of the textView as the name of android version stored in the MyAndroidName class.
        holder.textView.setText(name.getAndroidName());
    }

    // the method is a getter and used to return the size of the arraylist
    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    // class created that extends the RecyclerView.ViewHolder and is used to initialize the text view int the layout.
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.myTextView);
        }
    }
}

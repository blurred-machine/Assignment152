package com.example.paras.assignment_152;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.ArrayList;

// main activity class extending AppCompatActivity.
public class MainActivity extends AppCompatActivity {

    // initializing variables of toolbar, recycleView, arraylist and a custom adapter.
    Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayList<MyAndroidName> myArrayList;
    private MyAdapter adapter;


    // onCreate method.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing toolbar with findViewById referencing to the id of toolbar created in the toolbar layout
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        // setting the anction bar to the created toolbar.
        setSupportActionBar(toolbar);
        // calling the method that stores the data inside the array list.
        myAndroidVersionData();
        // initializing recycleView with findViewById referencing to the id of recyclerView created in the main layout.
        recyclerView = (RecyclerView) findViewById(R.id.myRecycleView);
        // creating the object of the custom adapter created before and passing the context and the data list in it.
        adapter = new MyAdapter(this, myArrayList);
        // attaching the adapter to the recyclerView using the setAdapter.
        recyclerView.setAdapter(adapter);
        // setting the layout of the data displayed in the recycle view as linear layout.
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    // method that stores the data in the array list.
    private void myAndroidVersionData() {

        // creating the object of the array list.
        myArrayList = new ArrayList<>();

        // adding the versions of android in the arrayList by creating the object of MyAndroidName class and
        // calling it's constructor and passing the android name as a string.
        myArrayList.add(new MyAndroidName("Alpha"));
        myArrayList.add(new MyAndroidName("Beta"));
        myArrayList.add(new MyAndroidName("Cupcake"));
        myArrayList.add(new MyAndroidName("Donut"));
        myArrayList.add(new MyAndroidName("Eclairs"));
        myArrayList.add(new MyAndroidName("Froyo"));
        myArrayList.add(new MyAndroidName("Gingerbread"));
        myArrayList.add(new MyAndroidName("Honeycomb"));
        myArrayList.add(new MyAndroidName("Icecream Sandwich"));
        myArrayList.add(new MyAndroidName("Jellybean"));
        myArrayList.add(new MyAndroidName("Kitkat"));
        myArrayList.add(new MyAndroidName("Lollipop"));
        myArrayList.add(new MyAndroidName("Marshmallow"));
        myArrayList.add(new MyAndroidName("Nougat"));
        myArrayList.add(new MyAndroidName("Oreo"));
    }


    // method called when option menu is created in the toolbar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // creating the object of the menuInflater by calling getMenuInflater method.
        MenuInflater inflater = getMenuInflater();
        // inflating the menu layout created in the menu directory.
        inflater.inflate(R.menu.menu_layout, menu);
        return true;
    }

    // method called when any element of the menu is clicked.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // storing the id of the item clicked.
        int id = item.getItemId();

        // using a switch case to find which menu item is clicked and show the message to user
        // in the form of a Toast.
        switch (id) {
            case R.id.deleteMenuItem:
                Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.addMenuItem:
                Toast.makeText(this, "Add Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.searchMenuItem:
                Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.settingMenuItem:
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}

package it.objective.materialtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;

    private ListView listView1;
    private ArrayAdapter<String> listAdapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listView1 = (ListView) findViewById(R.id.listView1);

        String[] someColors = new String[] {"Rosso", "Verde", "Bianco", "Giallo", "Blu", "Marrone", "Celeste", "Rosa", "Rosso", "Verde", "Bianco", "Giallo", "Blu", "Marrone", "Celeste"};
        ArrayList<String> colorArrayList = new ArrayList<String>();
        colorArrayList.addAll(Arrays.asList(someColors));

        listAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colorArrayList);
        listView1.setAdapter(listAdapter1);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.navigate) {
            startActivity(new Intent(this, SubActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}

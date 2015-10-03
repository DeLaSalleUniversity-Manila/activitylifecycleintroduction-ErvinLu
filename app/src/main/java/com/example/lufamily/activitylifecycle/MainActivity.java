package com.example.lufamily.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private static final String CLASS_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) //ONCREATE
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(CLASS_NAME, "onCreate() was called");
    }

    @Override
    public void onStart()   //ONSTART
    {
        super.onStart();
        Log.d(CLASS_NAME, "onStart() was called");
    }

    @Override
    public void onResume()  //ONRESUME
    {
        super.onResume();
        Log.d(CLASS_NAME, "onResume() was called");
    }

    @Override
    public void onPause()   //ONPAUSE
    {
        super.onPause();
        Log.d(CLASS_NAME, "onPause() was called");
    }

    @Override
    public void onSaveInstanceState(Bundle saveedInstanceState) //ONSAVEINSTANCESTATE
    {
        Log.d(CLASS_NAME, "onSaveInstanceState() was called");
    }

    @Override
    public void onStop()    //ONSTOP
    {
        super.onStop();
        Log.d(CLASS_NAME, "onStop() was called");
    }

    @Override
    public void onRestart() //ONRESTART
    {
        super.onRestart();
        Log.d(CLASS_NAME, "onRestart() was called");
    }

    @Override
    public void onDestroy() //ONDESTROY
    {
        super.onDestroy();
        Log.d(CLASS_NAME, "onDestroy() was called");
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

        return super.onOptionsItemSelected(item);
    }
}

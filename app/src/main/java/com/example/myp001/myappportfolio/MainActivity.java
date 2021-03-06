package com.example.myp001.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /** Called when the user touches a button */
    public void displayToast(View view) {

        Context context = getApplicationContext();
        String toastText = getString(R.string.main_activity_toast_start);
        int duration = Toast.LENGTH_SHORT;
        boolean buttonExists = true;

        switch (view.getId()){
            case R.id.spotify_btn:
                toastText += getString(R.string.spotify_toast);
                break;
            case R.id.scores_btn:
                toastText += getString(R.string.scores_toast);
                break;
            case R.id.library_app_btn:
                toastText += getString(R.string.library_toast);
                break;
            case R.id.build_it_bigger_btn:
                toastText += getString(R.string.build_it_bigger_toast);
                break;
            case R.id.xyz_reader_btn:
                toastText += getString(R.string.xyz_reader_toast);
                break;
            case R.id.capstone_btn:
                toastText += getString(R.string.capstone_toast);
                break;
            default:
                buttonExists=false;
        }

        if(buttonExists){
            toastText += getString(R.string.main_activity_toast_end);
        }else{
            toastText += getString(R.string.btn_doesnt_exist_toast);
        }

        Toast.makeText(context, toastText, duration).show();
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

package com.example.jites.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void apptoast1(View view) {


        Context context = getApplicationContext();
        CharSequence text = "This button will launch Spotify Streamer!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void apptoast2(View view) {


        Context context = getApplicationContext();
        CharSequence text = "This button will launch Scores App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void apptoast3(View view) {


        Context context = getApplicationContext();
        CharSequence text = "This button will launch Library App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void apptoast4(View view) {


        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void apptoast5(View view) {


        Context context = getApplicationContext();
        CharSequence text = "This button will launch XYZ Reader App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void apptoast6(View view) {


        Context context = getApplicationContext();
        CharSequence text = "This button will launch My Capstone App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

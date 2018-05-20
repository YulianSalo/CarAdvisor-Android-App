package com.julian_saloyahoo.caradvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TAG1 = "TestActivity";
    Button start;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button)findViewById(R.id.start);
        exit=(Button)findViewById(R.id.exit);
        Log.d(TAG1, "On Create .....");

    }
    public void goToPurpose(View View) {
        Intent intent = new Intent(this, Purpose.class);
        startActivity(intent);
    }

    public void exit(View view){
        finish();
        System.exit(0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG1, "On Start .....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG1, "On Resume .....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG1, "On Pause .....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG1, "On Restart .....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG1, "On Destroy .....");
    }


}

package com.julian_saloyahoo.caradvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Purpose extends AppCompatActivity {

    final String TAG2 = "TestActivity";
    Button exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purpose);
        exit=(Button)findViewById(R.id.exit);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.carry1, R.id.carry2, R.id.work3})
    public void goToChoice(View view) {
        switch (view.getId()) {
            case R.id.carry1:
                Intent intent = new Intent(this, Carry1.class);
                startActivity(intent);
                break;
            case R.id.carry2:
                intent = new Intent(this, Carry2.class);
                startActivity(intent);
                break;
            case R.id.work3:
                intent = new Intent(this, Work3.class);
                startActivity(intent);
                break;
        }
    }

    public void exit(View view){
        finish();
        System.exit(0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG2, "On Start .....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG2, "On Resume .....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG2, "On Pause .....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG2, "On Restart .....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG2, "On Destroy .....");
    }
}

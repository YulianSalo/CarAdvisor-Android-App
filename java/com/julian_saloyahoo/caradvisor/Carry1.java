package com.julian_saloyahoo.caradvisor;
import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.julian_saloyahoo.caradvisor.models.Car;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Carry1 extends AppCompatActivity {
    final String TAG10 = "TestActivity";
    Button Countinue;
    Button Back;
    @BindView(R.id.roadster)
    RadioButton roadster;
    @BindView(R.id.coupe2)
    RadioButton coupe2;
    @BindView(R.id.coupe4)
    RadioButton coupe4;
    @BindView(R.id.saloon4)
    RadioButton saloon4;
    @BindView(R.id.hatchback3)
    RadioButton hatchback3;
    @BindView(R.id.hatchback5)
    RadioButton hatchback5;
    @BindView(R.id.estate)
    RadioButton estate;
    @BindView(R.id.suv3)
    RadioButton suv3;
    @BindView(R.id.suv5)
    RadioButton suv5;
    @BindView(R.id.minivan7)
    RadioButton minivan7;
    @BindView(R.id.van9)
    RadioButton van9;
    int ex_people=0;
    int doors=0;
    String car_layout="_";
    Car test_car = new Car(1, "testmake", "testmodel", "test_layuot", "testtrunk", "testgearbox", 1, 1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carry1);
        Countinue = findViewById(R.id.next);
        Back = findViewById(R.id.back);
        ButterKnife.bind(this);
        Log.d(TAG10, "On Create .....");

    }
    public void people(View view) {
        switch (view.getId()) {
            case R.id.exp2:
                ex_people=2;

            case R.id.exp4:
                ex_people=4;
                //roadster.setEnabled(false);

            case R.id.exp5:
                ex_people=5;
                //roadster.setEnabled(false);
                //coupe2.setEnabled(false);
                //hatchback3.setEnabled(false);
                //suv3.setEnabled(false);

            case R.id.exp7:
                ex_people=7;
                //roadster.setEnabled(false);
                /*coupe2.setEnabled(false);
                coupe4.setEnabled(false);
                hatchback3.setEnabled(false);
                hatchback5.setEnabled(false);
                saloon4.setEnabled(false);
                estate.setEnabled(false);
                suv3.setEnabled(false);
                suv5.setEnabled(false);*/

            case R.id.exp9:
                ex_people=9;
                /*roadster.setEnabled(false);
                coupe2.setEnabled(false);
                coupe4.setEnabled(false);
                hatchback3.setEnabled(false);
                hatchback5.setEnabled(false);
                saloon4.setEnabled(false);
                estate.setEnabled(false);
                suv3.setEnabled(false);
                suv5.setEnabled(false);
                minivan7.setEnabled(false);*/

        }
        test_car.setExpeople(ex_people);
    }

    public void car_layout(View view) {
        switch (view.getId()) {
            case R.id.roadster:
                car_layout="Roadster";
                doors=2;
            case R.id.coupe2:
                car_layout="2 door coupe";
                doors=2;
            case R.id.coupe4:
                car_layout="4 door coupe";
                doors=4;
            case R.id.hatchback3:
                car_layout="3 door hatchback";
                doors=3;
            case R.id.hatchback5:
                car_layout="5 door hatchback";
                doors=5;
            case R.id.saloon4:
                car_layout="4 door saloon";
                doors=4;
            case R.id.estate:
                car_layout="5 door estate";
                doors=5;
            case R.id.suv3:
                car_layout="3 door SUV";
                doors=3;
            case R.id.suv5:
                car_layout="5 door SUV";
                doors=5;
            case R.id.minivan7:
                car_layout="Minivan";
                doors=5;
            case R.id.van9:
                car_layout="Van";
                doors=5;
        }
        test_car.setLayout(car_layout);
        test_car.setDoors(doors);
    }

    public void nextPage (View view) {
        Intent intent = new Intent(this, Carry12.class);
        //intent.putExtra("ex_people",str_expeople);
        intent.putExtra("test_car", (Parcelable) test_car);
        startActivity(intent);
    }
    public void backPage (View view){
        Intent intent = new Intent(this, Purpose.class);
        startActivity(intent);
    }

}

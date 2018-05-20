package com.julian_saloyahoo.caradvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.julian_saloyahoo.caradvisor.models.Car;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Carry12 extends AppCompatActivity {
    final String TAG1 = "TestActivity";
    Button endSurvey;
    Button Back;
    String ex_people="_";
    Car test_car = new Car(1, "testmake", "testmodel", "test_layuot", "testtrunk", "testgearbox", 1, 1);
    @BindView(R.id.spacious) RadioButton spacious;
    @BindView(R.id.small) RadioButton small;
    @BindView(R.id.manual) RadioButton manual;
    @BindView(R.id.auto) RadioButton auto;
    @BindView(R.id.both) RadioButton both;
    @BindView(R.id.usd15) RadioButton usd15;
    @BindView(R.id.usd20) RadioButton usd20;
    @BindView(R.id.usd30) RadioButton usd30;
    @BindView(R.id.usd40) RadioButton usd40;
    @BindView(R.id.usd50) RadioButton usd50;
    @BindView(R.id.usd_more) RadioButton usd_more;
    int doors;
    String make;
    String model;
    String layout;
    String trunk;
    String gearbox;
    int price;
    int expeople;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        endSurvey=(Button)findViewById(R.id.next);
        Back=(Button)findViewById(R.id.back);
        setContentView(R.layout.activity_carry12);
        //String ex_people=intent.getStringExtra("ex_people");
        ButterKnife.bind(this);
        //Car testcar=getIntent().getParcelableExtra("test_car");
    }
    /*public void trunk(View view){
        if (ex_people=="9"){
            spacious.setEnabled(false);
        }

    }*/
    public void  get_extra(){
        test_car=getIntent().getParcelableExtra("test_car");
        doors=test_car.getDoors();
        make=test_car.getMake();
        model=test_car.getModel();
        trunk=test_car.getTrunk();
        gearbox=test_car.getGearbox();
        price=test_car.getPrice();
        expeople=test_car.getExpeople();
        this.getPackageName();
    }
    public void s_trunk(View view){
        switch (view.getId()){
            case R.id.spacious:
                trunk="Spacious";
            case R.id.small:
                trunk="Small";
        }
        test_car.setTrunk(trunk);
    }
    public void s_gearbox(View view){
        switch (view.getId()){
            case R.id.manual:
                gearbox="Manual";
            case R.id.auto:
                gearbox="Automatic";
            case R.id.both:
                gearbox="Both";
        }
        test_car.setGearbox(gearbox);
    }

    public void EndSurvey(View view){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("test_car", (Parcelable) test_car);
        startActivity(intent);
    }
    public void backPage(View view){
        Intent intent = new Intent(this, Carry1.class);
        startActivity(intent);
    }

}

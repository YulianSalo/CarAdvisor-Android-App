package com.julian_saloyahoo.caradvisor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.julian_saloyahoo.caradvisor.models.Car;

public class Result extends AppCompatActivity {
    int i=0;
    int doors;
    String make;
    String model;
    String layout;
    String trunk;
    String gearbox;
    int price;
    int expeople;
    Car test_car = new Car(1, "testmake", "testmodel", "test_layuot", "testtrunk", "testgearbox", 1, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
    public void get_extra() {
        test_car = getIntent().getParcelableExtra("test_car");
        doors = test_car.getDoors();
        make = test_car.getMake();
        model = test_car.getModel();
        trunk = test_car.getTrunk();
        gearbox = test_car.getGearbox();
        price = test_car.getPrice();
        expeople = test_car.getExpeople();
        this.getPackageName();
    }
    public void result(View view){
        for(i=0;i<11; i++){
            if(doors==car[i].doors){

            }

        }
    }
}
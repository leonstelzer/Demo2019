package com.test.demo2019;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity{

    private Button changebutton;
    private Button displaybutton;
    private ImageView profilbild;
    private Button reset;
    private Button alert;
    private Button changebild;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private ConstraintLayout mainMU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changebutton = (Button) findViewById(R.id.changebutton);
        displaybutton = (Button) findViewById(R.id.displaybutton);
        profilbild = (ImageView) findViewById(R.id.profilbild);
        changebild = (Button) findViewById(R.id. changebild);
        reset = (Button) findViewById(R.id. reset);
        alert = (Button) findViewById(R.id.alert);
        mainMU = (ConstraintLayout) findViewById(R.id.mainMU);


        changebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                displaybutton.setText("Yo Leon, was geht?!");
            }
        });

        changebild.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                profilbild.setImageResource(R.drawable.bild1);

            }
        });


        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                profilbild.setImageResource(R.drawable.bild2);
            }
        });


        alert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.test,null);

                popupWindow = new PopupWindow(container,1100,430, true);
                popupWindow.showAtLocation(mainMU, Gravity.NO_GRAVITY,450,620);

                container.setOnTouchListener(new View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent){
                        popupWindow.dismiss();
                        return true;
                    }
                });


            }
        });



        }}
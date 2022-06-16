package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fragments.Fragments.Call;
import com.example.fragments.Fragments.Camera;
import com.example.fragments.Fragments.Chat;
import com.example.fragments.Fragments.Status;

public class MainActivity extends AppCompatActivity {
    TextView chatbtn,statusbtn,callbtn;
    ImageView cameraimg;
    LinearLayout linearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("WhatsApp");
        chatbtn = findViewById(R.id.chatbtn);
        statusbtn = findViewById(R.id.statusbtn);
        callbtn = findViewById(R.id.callbtn);
        linearlayout=findViewById(R.id.linearlayout);
        cameraimg = findViewById(R.id.cameraimg);


        chatbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Chat chat=new Chat();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, chat);
                transaction.commit();
            }
        });

        statusbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Status status=new Status();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, status);
                transaction.commit();

            }
        });

        callbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Call call=new Call();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, call);
                transaction.commit();
            }
        });

        cameraimg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Camera camera=new Camera();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, camera);
                transaction.commit();
            }
        });
    }
}
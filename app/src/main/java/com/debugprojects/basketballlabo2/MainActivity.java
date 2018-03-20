package com.debugprojects.basketballlabo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ContTeamA;
    private TextView ContTeamB;
    private Button Btn1A;
    private Button Btn2A;
    private Button Btn3A;
    private Button Btn1B;
    private Button Btn2B;
    private Button Btn3B;
    private Button Reset;
    private int ContNumA=0;
    private int ContNumB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContTeamA= findViewById(R.id.cont_team_a);
        ContTeamB= findViewById(R.id.cont_team_b);

        Btn1A = findViewById(R.id.cont_1_a);
        Btn2A = findViewById(R.id.cont_2_a);
        Btn3A = findViewById(R.id.cont_3_a);

        Btn1B = findViewById(R.id.cont_1_b);
        Btn2B = findViewById(R.id.cont_2_b);
        Btn3B = findViewById(R.id.cont_3_b);

        Reset= findViewById(R.id.reset_btn);

        /*
        * Team A
        * */

        Btn1A.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ContNumA++;
                ContTeamA.setText(ContNumA+"");
            }
        });

        Btn2A.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ContNumA += 2;
                ContTeamA.setText(ContNumA+"");
            }
        });

        Btn3A.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ContNumA+=3;
                ContTeamA.setText(ContNumA+"");
            }
        });

        /*
        * Team B
        * */

        Btn1B.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ContNumB++;
                ContTeamB.setText(ContNumB+ "");
            }
        });

        Btn2B.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ContNumB+=2;
                ContTeamB.setText(ContNumB+"");
            }
        });

        Btn3B.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ContNumB+=3;
                ContTeamB.setText(ContNumB+"");
            }
        });

        /**
         * Reset
         *
         * */

        Reset.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ContNumB=0;
                ContNumA=0;
                ContTeamB.setText(ContNumB+"");
                ContTeamA.setText(ContNumA+"");
            }
        });

    }
}

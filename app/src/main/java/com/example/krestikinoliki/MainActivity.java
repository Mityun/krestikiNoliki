package com.example.krestikinoliki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    TextView textView;
    String board[][] = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
    String mark, mark1;
    int r1, r2;
    String var1 = "X";
    String var2 = "O";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
    }
    /// human move

    public void but1(View v){
        board[0][0] = var1;
        button1.setText(var1);
        button1.setEnabled(false);
    }

    public void but2(View v){
        board[0][1] = var1;
        button2.setText(var1);
        button2.setEnabled(false);
    }

    public void but3(View v){
        board[0][2] = var1;
        button3.setText(var1);
        button3.setEnabled(false);
    }

    public void but4(View v){
        board[1][0] = var1;
        button4.setText(var1);
        button4.setEnabled(false);
    }

    public void but5(View v){
        board[1][1] = var1;
        button5.setText(var1);
        button5.setEnabled(false);
    }

    public void but6(View v){
        board[1][2] = var1;
        button6.setText(var1);
        button6.setEnabled(false);
    }

    public void but7(View v){
        board[2][0] = var1;
        button7.setText(var1);
        button7.setEnabled(false);
    }

    public void but8(View v){
        board[2][1] = var1;
        button8.setText(var1);
        button8.setEnabled(false);
    }

    public void but9(View v){
        board[2][2] = var1;
        button9.setText(var1);
        button9.setEnabled(false);
    }


    /// bot move
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    TextView add,subs,equal,multiply,divide,mod,back,clear,decimal,zero,one,two,three,four,five,six,seven,eight,nine,screen,screen2;
    String num2 = "0",num = "0",display;
    BigDecimal result = new BigDecimal("0");
    char operator = '+';
    boolean aBoolean = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        subs = findViewById(R.id.substract);
        equal = findViewById(R.id.equalTo);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        mod = findViewById(R.id.mod);
        back = findViewById(R.id.back);
        clear = findViewById(R.id.clear);
        decimal = findViewById(R.id.decimal);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        screen = findViewById(R.id.screen);
        screen2 = findViewById(R.id.screen2);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if(!num.equals("0")){
                    num = num + "0";
                    screen.setText(num);
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "1";
                screen.setText(num);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "2";
                screen.setText(num);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "3";
                screen.setText(num);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "4";
                screen.setText(num);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "5";
                screen.setText(num);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "6";
                screen.setText(num);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "7";
                screen.setText(num);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "8";
                screen.setText(num);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if (num.equals("0"))
                {num = "";}
                num = num + "9";
                screen.setText(num);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    aBoolean = false;
                    num = "0";
                }
                if(!num.contains(".")) {

                    if (num.equals("0")) {
                        num = "";
                    }
                    num = num + ".";
                    screen.setText(num);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "0";
                num2 = "0";
                operator = '+';
                result = new BigDecimal("0");
                screen.setText(num);
                screen2.setText("");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                if(num.length() > 0)
                {
                    num = num.substring(0,num.length()-1);
                    screen.setText(num);
                }
//
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.length() > 0)
                {
                    if(!num.equals(".")) {
                        num2 = operation(num, num2, operator);
                        operator = '+';
                        num = "";
                        display = num2 + operator;
                        screen2.setText(display);
                        screen.setText(num);
                    }
                }
                else
                {
                    operator = '+';
                    display = num2 + operator;
                    screen2.setText(display);
                }
            }
        });

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.length() > 0) {
                    if(!num.equals(".")) {
                        num2 = operation(num, num2, operator);
                        operator = '-';
                        num = "";
                        display = num2 + operator;
                        screen2.setText(display);
                        screen.setText(num);
                    }
                }
                else
                {
                    operator = '-';
                    display = num2 + operator;
                    screen2.setText(display);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.length() > 0) {
                    if(!num.equals(".")) {
                        num2 = operation(num, num2, operator);
                        operator = 'x';
                        num = "";
                        display = num2 + operator;
                        screen2.setText(display);
                        screen.setText(num);
                    }
                }
                else
                {
                    operator = 'x';
                    display = num2 + operator;
                    screen2.setText(display);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!num.equals("0") && num.length() > 0) {
                    if(!num.equals(".")) {
                        num2 = operation(num, num2, operator);
                        operator = '/';
                        num = "";
                        display = num2 + operator;
                        screen2.setText(display);
                        screen.setText(num);
                    }
                }
                else
                {
                    operator = '/';
                    display = num2 + operator;
                    screen2.setText(display);
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.length() > 0) {
                    if(!num.equals(".")) {
                        num2 = operation(num, num2, operator);
                        operator = '%';
                        num = "";
                        display = num2 + operator;
                        screen2.setText(display);
                        screen.setText(num);
                    }
                }
                else
                {
                    operator = '%';
                    display = num2 + operator;
                    screen2.setText(display);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aBoolean = true;
                if (num.length() != 0)
                {
                    if(!num.equals(".")) {
                        operation(num, num2, operator);
                        display = "" + result;
                        screen.setText(display);
                        num2 = "0";
                        num = result.toString();
                        operator = '+';
                        screen2.setText("");
                    }
                }
            }
        });


    }

    String operation(String s1, String s2, char operator)
    {
        BigDecimal o1 = new BigDecimal(s1);
        BigDecimal o2 = new BigDecimal(s2);
        switch(operator)
        {

            case '+':
                result = o2.add(o1);
                return result.toString();

            case '-':
                result = o2.subtract(o1);
                return result.toString();

            case 'x':
                result = o2.multiply(o1);
                return result.toString();

            case '/':
                if(o1.equals(new BigDecimal("0"))){
                    Toast.makeText(MainActivity.this,"Cannot divide",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = o2.divide(o1, RoundingMode.HALF_EVEN);
                    return result.toString();
                }
                break;

            case '%':
                if(o1.equals(new BigDecimal("0"))){
                    Toast.makeText(MainActivity.this,"Cannot divide",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = o2.remainder(o1);
                    return result.toString();
                }
        }
        return result.toString();
    }
}

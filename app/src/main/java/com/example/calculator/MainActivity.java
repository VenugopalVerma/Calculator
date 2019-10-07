package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    TextView add,subs,equal,multiply,divide,mod,back,clear,decimal,zero,one,two,three,four,five,six,seven,eight,nine,screen,screen2;
    String num2 = "0",num = "0";
    boolean aBoolean = false;

    BigDecimal result = new BigDecimal("0");
    char operator = '+';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (TextView) findViewById(R.id.add);
        subs = (TextView) findViewById(R.id.substract);
        equal = (TextView) findViewById(R.id.equalTo);
        multiply = (TextView) findViewById(R.id.multiply);
        divide = (TextView) findViewById(R.id.divide);
        mod = (TextView) findViewById(R.id.mod);
        back = (TextView) findViewById(R.id.back);
        clear = (TextView) findViewById(R.id.clear);
        decimal = (TextView) findViewById(R.id.decimal);
        zero = (TextView) findViewById(R.id.zero);
        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);
        screen = (TextView) findViewById(R.id.screen);
        screen2 = (TextView) findViewById(R.id.screen2);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num != "0"){
                    num = num + "0";
                    screen.setText("" + num);
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "1";
                screen.setText("" + num);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "2";
                screen.setText("" + num);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "3";
                screen.setText("" + num);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "4";
                screen.setText("" + num);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "5";
                screen.setText("" + num);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "6";
                screen.setText("" + num);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "7";
                screen.setText("" + num);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "8";
                screen.setText("" + num);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == "0")
                {num = "";}
                num = num + "9";
                screen.setText("" + num);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.contains(".") == false) {

                    if (num == "0") {
                        num = "";
                    }
                    num = num + ".";
                    screen.setText("" + num);
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
                if(num.length() > 0)
                {
                    num = num.substring(0,num.length()-1);
                    screen.setText(num);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.length() > 0)
                {
                    num2 = operation(num, num2, operator);
                    operator = '+';
                    num = "";
                    screen2.setText(num2 + operator);
                    screen.setText(num);
                }
                else
                {
                    operator = '+';
                    screen2.setText(num2 + operator);
                }
            }
        });

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.length() > 0) {
                    num2 = operation(num, num2, operator);
                    operator = '-';
                    num = "";
                    screen2.setText(num2 + operator);
                    screen.setText(num);
                }
                else
                {
                    operator = '-';
                    screen2.setText(num2 + operator);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num.length() > 0) {
                    num2 = operation(num, num2, operator);
                    operator = '*';
                    num = "";
                    screen2.setText(num2 + operator);
                    screen.setText(num);
                }
                else
                {
                    operator = '*';
                    screen2.setText(num2 + operator);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num != "0" && num.length() > 0) {
                    num2 = operation(num, num2, operator);
                    operator = '/';
                    num = "";
                    screen2.setText(num2 + operator);
                    screen.setText(num);
                }
                else
                {
                    operator = '/';
                    screen2.setText(num2 + operator);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num.length() != 0)
                {
                    operation(num, num2, operator);
                    screen.setText("" + result);
                    num2 = "0";
                    num = result.toString();
                    operator = '+';
                    screen2.setText("");
                    //aBoolean = true;
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

            case '*':
                result = o2.multiply(o1);
                return result.toString();

            case '/':
                if(o1.equals(new BigDecimal("0"))){
                    Toast.makeText(MainActivity.this,"Cannot divide",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = o2.divide(o1);
                    return result.toString();
                }
                break;

            case '%':
                break;
        }
        return result.toString();
    }
}

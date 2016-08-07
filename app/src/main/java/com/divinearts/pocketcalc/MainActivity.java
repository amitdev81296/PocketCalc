package com.divinearts.pocketcalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button div = (Button) findViewById(R.id.div);
        Button mul = (Button) findViewById(R.id.mul);
        Button sub = (Button) findViewById(R.id.sub);
        Button add = (Button) findViewById(R.id.add);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button zero = (Button) findViewById(R.id.zero);
        Button dot = (Button) findViewById(R.id.dot);
        Button equals = (Button) findViewById(R.id.equals);
        Button clear = (Button) findViewById(R.id.clear);

        final EditText calcText = (EditText) findViewById(R.id.calcText);

        div.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"/";
                        calcText.setText(text);
                    }
                }
        );
        mul.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"x";
                        calcText.setText(text);
                    }
                }
        );
        sub.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"-";
                        calcText.setText(text);
                    }
                }
        );
        add.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"+";
                        calcText.setText(text);
                    }
                }
        );
        seven.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"7";
                        calcText.setText(text);
                    }
                }
        );
        eight.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"8";
                        calcText.setText(text);
                    }
                }
        );
        nine.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"9";
                        calcText.setText(text);
                    }
                }
        );
        four.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"4";
                        calcText.setText(text);
                    }
                }
        );
        five.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"5";
                        calcText.setText(text);
                    }
                }
        );
        six.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"6";
                        calcText.setText(text);
                    }
                }
        );
        one.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"1";
                        calcText.setText(text);
                    }
                }
        );
        two.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"2";
                        calcText.setText(text);
                    }
                }
        );
        three.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"3";
                        calcText.setText(text);
                    }
                }
        );
        zero.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+"0";
                        calcText.setText(text);
                    }
                }
        );
        dot.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String text = calcText.getText().toString()+".";
                        calcText.setText(text);
                    }
                }
        );
        clear.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        calcText.setText("");
                    }
                }
        );
        equals.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        String expression = calcText.getText().toString();
                        String firstNum = "", secondNum = "", result;
                        char op = '!';
                        int count=-1;
                        for(int i=0;i<expression.length();i++){
                            if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == 'x' || expression.charAt(i) == '/'){
                                count = i;
                                op = expression.charAt(i);
                            }
                            else{
                                if(count!=-1)
                                    secondNum = secondNum + expression.charAt(i);
                                else
                                    firstNum = firstNum + expression.charAt(i);
                            }
                        }
                        switch (op){
                            case '+':   result = Float.toString(Float.parseFloat(firstNum) + Float.parseFloat(secondNum));
                                        calcText.setText(result);
                                        break;
                            case '-':   result = Float.toString(Float.parseFloat(firstNum) - Float.parseFloat(secondNum));
                                        calcText.setText(result);
                                        break;
                            case 'x':   result = Float.toString(Float.parseFloat(firstNum) * Float.parseFloat(secondNum));
                                        calcText.setText(result);
                                        break;
                            case '/':   result = Float.toString(Float.parseFloat(firstNum) / Float.parseFloat(secondNum));
                                        calcText.setText(result);
                                        break;
                        }
                    }
                }
        );
    }
}

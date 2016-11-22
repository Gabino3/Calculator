package com.example.nino.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText operand1, operand2;
    private TextView txtResult;
    private Button btnAdd, btnSub, btnMult, btnDiv, btnClr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        operand1 = (EditText) findViewById(R.id.operand1);
        operand2 = (EditText) findViewById(R.id.operand2);
        txtResult = (TextView) findViewById(R.id.result);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnClr = (Button) findViewById(R.id.btnClr);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().toString().isEmpty() || operand2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                    return;
                }
                double res = Double.parseDouble(operand1.getText().toString()) + Double.parseDouble(operand2.getText().toString());
                txtResult.setText(String.format(Locale.ENGLISH, "%.2f", res));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().toString().isEmpty() || operand2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                    return;
                }
                double res = Double.parseDouble(operand1.getText().toString()) / Double.parseDouble(operand2.getText().toString());
                txtResult.setText(String.format(Locale.ENGLISH, "%.2f", res));
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().toString().isEmpty() || operand2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                    return;
                }
                double res = Double.parseDouble(operand1.getText().toString()) * Double.parseDouble(operand2.getText().toString());
                txtResult.setText(String.format(Locale.ENGLISH, "%.2f", res));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().toString().isEmpty() || operand2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                    return;
                }
                double res = Double.parseDouble(operand1.getText().toString()) - Double.parseDouble(operand2.getText().toString());
                txtResult.setText(String.format(Locale.ENGLISH, "%.2f", res));
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

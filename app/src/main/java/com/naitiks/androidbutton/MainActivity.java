package com.naitiks.androidbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText1 = (EditText) findViewById(R.id.edit_txt_1);
        final EditText editText2 = (EditText) findViewById(R.id.edit_txt_2);
        Button btnAdd = (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = addTwoValues(editText1.getText().toString(), editText2.getText().toString());
                Toast.makeText(MainActivity.this, String.valueOf(ans), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int addTwoValues(String val1, String val2){
        return Integer.parseInt(val1) + Integer.parseInt(val2);
    }
}

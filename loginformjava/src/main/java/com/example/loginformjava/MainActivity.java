package com.example.loginformjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1 = findViewById(R.id.editText);
        final EditText e2 =findViewById(R.id.editText2);
        final TextView rst=findViewById(R.id.textView);
        Button btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(e1.getText().toString());
                String s=Integer.toString(val);

                String paswd=e2.getText().toString();

                if(s.equals(paswd))
                {
                    rst.setText("Success");
                }
                else {
                    rst.setText("Fail");
                }
            }
        });


    }
}

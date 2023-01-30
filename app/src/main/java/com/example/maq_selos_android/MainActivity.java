package com.example.maq_selos_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittxt1;
    TextView TV1,TV2;
    Button Btn;
    int quantia=0,quoc,r,s5=0,s3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edittxt1 = (EditText) findViewById(R.id.Edit1);
        TV1 = (TextView) findViewById(R.id.textView2);
        TV2 = (TextView) findViewById(R.id.textView3);
        Btn = (Button) findViewById(R.id.button);





        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String truth = edittxt1.getText().toString();
                int finaltruth = Integer.parseInt(truth.replaceAll("[\\D]" , "" ));
                quantia = finaltruth;
                if (quantia >= 8) {
                    quoc = quantia / 5;
                    r = quantia % 5;
                    switch (r) {
                        case 0:
                            s5 = quoc;
                            s3 = 0;
                            break;
                        case 1:
                            s5 = quoc - 1;
                            s3 = 2;
                            break;
                        case 2:
                            s5 = quoc - 2;
                            s3 = 4;
                            break;
                        case 3:
                            s5 = quoc;
                            s3 = 1;
                            break;
                        case 4:
                            s5 = quoc - 1;
                            s3 = 3;
                            break;
                    }
                    TV1.setText("Selos Cinco: "+s5);
                    TV2.setText("Selos Três: "+s3);
                    edittxt1.setText("");
                }else{
                    TV1.setText("Quantia Inválida");
                    TV2.setText("Quantia Inválida");
                    edittxt1.setText("");
                }
            }


        });

    }

}
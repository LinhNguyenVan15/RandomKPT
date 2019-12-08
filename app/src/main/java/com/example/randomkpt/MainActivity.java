package com.example.randomkpt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView,textViewBanner;
    Button btnrandom;
    EditText edtmin,edtmax;
    ImageView imge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btnrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tao số ngẫu nhiên bằng hàm random
                String chuoi1=edtmin.getText().toString().trim();
                String chuoi2=edtmax.getText().toString().trim();

                if (chuoi1.length()==0||chuoi2.length()==0){
                    Toast.makeText(MainActivity.this,"Vui lòng nhập vào giá trị bạn muốn: ",Toast.LENGTH_LONG ).show();
                }else {
                    //ép kiểu dữ liệu kiểu chuỗi sang int
                    int min=Integer.parseInt(chuoi1);
                    int max=Integer.parseInt(chuoi2);

                    Random random=new Random();
                    int number=random.nextInt(max-min+1)+min;
                    //số->chuối
                    textView.setText(String.valueOf(number));
                }
            }
        });
    }

    private void Anhxa() {
        textView=findViewById(R.id.textviewNumber);
        btnrandom=findViewById(R.id.buttonRandom);
        edtmin=findViewById(R.id.edittextmin);
        edtmax=findViewById(R.id.edittextmax);
        textViewBanner=findViewById(R.id.textviewbanner);
        imge=findViewById(R.id.imagesrc);
    }
}

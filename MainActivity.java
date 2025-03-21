package com.example.viewrandomnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;  // Random 클래스를 import 해야 합니다.

public class MainActivity extends AppCompatActivity {

    private TextView textViewRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // textViewRandomNumber는 XML에서 ID를 참조합니다.
        textViewRandomNumber = findViewById(R.id.textViewRandomNumber);
    }

    // 버튼이 클릭되었을 때 실행되는 메소드
    public void generateRandomNumber(View view) {
        Random random = new Random();
        int randomnumber = random.nextInt(100); // 0에서 99까지 난수를 생성

        // 생성된 난수를 textView에 표시
        textViewRandomNumber.setText("난수: " + randomnumber);
    }
}

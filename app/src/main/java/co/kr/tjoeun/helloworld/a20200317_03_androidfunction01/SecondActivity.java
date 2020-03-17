package co.kr.tjoeun.helloworld.a20200317_03_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.kr.tjoeun.helloworld.a20200317_03_androidfunction01.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}

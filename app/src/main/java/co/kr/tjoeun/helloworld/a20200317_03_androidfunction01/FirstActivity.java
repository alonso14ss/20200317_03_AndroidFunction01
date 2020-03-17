package co.kr.tjoeun.helloworld.a20200317_03_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import co.kr.tjoeun.helloworld.a20200317_03_androidfunction01.databinding.ActivityFirstBinding;
import co.kr.tjoeun.helloworld.a20200317_03_androidfunction01.databinding.ActivityMainBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_first);
    }
}

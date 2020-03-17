package co.kr.tjoeun.helloworld.a20200317_03_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.kr.tjoeun.helloworld.a20200317_03_androidfunction01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                퍼스트 액티비티로 이동하자
                Intent intent = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);

            }
        });

        binding.goToSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                세컨드 액티비티로 이동하자!
//                입력할 메세지를 받아서 세컨드 액티비티에 전달!

                String inputMessage = binding.inputEdt.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                inputMessage 변수를 "message"라는 이름표를 붙여서 첨부
                intent.putExtra("message",inputMessage);
                startActivity(intent);

            }
        });


    }
}
package com.example.monilj.connecttosecondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button goToAnimationcreen;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extra=  getIntent().getExtras();
        textView = (TextView) findViewById(R.id.secondActiTextView);
        button = (Button) findViewById(R.id.backButton);

        if(extra!=null){
            String message = extra.getString("Message");
            textView.setText(message);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = getIntent();
                returnIntent.putExtra("returnData", " from second activity");
                setResult(RESULT_OK,returnIntent);
                finish();
            }
        });

        goToAnimationcreen = (Button) findViewById(R.id.showAnimationButton);
        goToAnimationcreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SecondActivity.this,AnimationAct.class);
//                intent.putExtra("Message","Came from first activity");
                startActivity(intent);
            }
        });

    }

}

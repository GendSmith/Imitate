package com.example.admin.imitate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.bt1);

        bt1.setOnClickListener(new Bt1Listener());
    }

    class Bt1Listener  implements OnClickListener {
        @Override

        public void onClick(View v) {

//            Context context = getApplicationContext();
//            CharSequence text = "Hello toast!";
//            int duration = Toast.LENGTH_SHORT;
//
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
            //Toast.makeText("test",9);
           // Log.i("定义内部类","点击事件");
        }
    }

}

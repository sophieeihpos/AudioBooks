package app.com.example.android.audiobooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1= (TextView) findViewById(R.id.book1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Book1Activity.class);
                startActivity(i);
            }
        });

        TextView textView2= (TextView) findViewById(R.id.book2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Book2Activity.class);
                startActivity(i);
            }
        });

        TextView textView3= (TextView) findViewById(R.id.book3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Book3Activity.class);
                startActivity(i);
            }
        });

    }
}

package com.example.administrator.good1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.victory);
        mediaplayer.setLooping(true); mediaplayer.start();
        Button b1=(Button)findViewById(R.id.button_1);
        EditText editText1=(EditText)findViewById(R.id.editText1) ;
        String str1="";
        str1=editText1.getText().toString();
        TextView textView1=(TextView)findViewById(R.id.textView1) ;
        textView1.setText(str1.toCharArray(),0,str1.length());
        EditText editText2=(EditText)findViewById(R.id.textView2) ;
        String str2="";
        str2=editText2.getText().toString();
        TextView textView2=(TextView)findViewById(R.id.textView2) ;
        textView2.setText(str2.toCharArray(),0,str2.length());
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                Toast.makeText(MainActivity.this,"加载中...",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}

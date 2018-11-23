package com.example.sys.custadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
      private ListView listView;
      String[] ary={"s","s1","s2","s3"};
      int[] img={R.drawable.facebook,R.drawable.instagram,R.drawable.linkedin,R.drawable.twitter};
      ArrayAdapter<String>adapter;
      
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

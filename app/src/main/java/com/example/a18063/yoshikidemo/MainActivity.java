package com.example.a18063.yoshikidemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast=Toast.makeText(getApplicationContext(),"确认退出？",0);
        Button cameraAlbum=(Button)findViewById(R.id.camera_album);
        cameraAlbum.setOnClickListener(this);
    }
    @Override
    public void onBackPressed(){
        quitToast();
    }
    private void quitToast(){
        if(null==toast.getView().getParent()){
            toast.show();
        }else{
            System.exit(0);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.camera_album:
                Intent cameraIntent=new Intent(this,CameraAlbum.class);
                startActivity(cameraIntent);
        }
    }
}
package com.actomoion.velademo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.felipecsl.gifimageview.library.GifImageView;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class MainActivity extends AppCompatActivity {

    private GifImageView gifImageView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        gifImageView = (GifImageView)findViewById(R.id.gifImageView);

    }

    public void encendervela(View v){
        imageView.setVisibility(View.GONE);
        gifVela();
        gifImageView.setVisibility(View.VISIBLE);
    }

    public void gifVela(){
        //Set GIFImageView resource
        try{
            InputStream inputStream = getAssets().open("vela.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }
        catch (IOException ex)
        {

        }
    }



}

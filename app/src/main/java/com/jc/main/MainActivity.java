package com.jc.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jc.main.handle_argb.PrimaryClass;
import com.jc.main.handle_matrix.MatrixActivity;
import com.jc.main.handle_pixel.PixelActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleArgb(View view) {
        startActivity(new Intent(this, PrimaryClass.class));
    }

    public void handleMatrix(View view) {
        startActivity(new Intent(this, MatrixActivity.class));
    }

    public void handlePixel(View view) {
        startActivity(new Intent(this, PixelActivity.class));
    }
}

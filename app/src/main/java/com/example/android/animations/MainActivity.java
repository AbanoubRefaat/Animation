package com.example.android.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade (View view){

        ImageView peter =(ImageView) findViewById(R.id.imPeter);
        ImageView stewie  =(ImageView) findViewById(R.id.imStewie);


        peter.animate().alpha(0f).setDuration(2000);
        stewie.animate().alpha(1f).setDuration(2000);





        // it works without this
        //stewie.bringToFront();


        /*
        for moving pics downward
                peter.animate().translationYBy(1000f).setDuration(2000);

                upward
                translationYBy(-1000f)

                to the right
                translationXBy(1000f)

                to the left
                translationXBy(-1000f)

         */

        /*
        setting image out of view
                stewie.setTranslationX(-1000);


         */

        /*
        for shrinking size

                stewie.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

         */


    }
}

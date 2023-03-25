package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1=findViewById(R.id.dropdown_menu);

        List<ImageOption> imageOptions = new ArrayList<>();
        imageOptions.add(new ImageOption("Image 1", R.drawable.image1));
        imageOptions.add(new ImageOption("Image 2", R.drawable.image2));
        imageOptions.add(new ImageOption("Image 3", R.drawable.image3));

        Spinner imageDropdown = findViewById(R.id.dropdown_menu);
        ImageOptionAdapter adapter = new ImageOptionAdapter(this, imageOptions);
        imageDropdown.setAdapter(adapter);

    }
}
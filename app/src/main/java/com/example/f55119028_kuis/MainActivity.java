package com.example.f55119028_kuis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.example.f55119028_kuis.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_main);

        // Data Ahmad Dahlan
        binding.imgPhoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ahmad_dahlan));
        binding.txtName1.setText("Ahmad Dahlan");
        binding.txtDescription1.setText("Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, ");
        // Data Ahmad Yani
        binding.imgPhoto2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ahmad_yani));
        binding.txtName2.setText("Ahmad Yani");
        binding.txtDescription2.setText("Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922");
        // Data Maulana Adnan Khalid
        binding.imgPhoto3.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.maulana));
        binding.txtName3.setText("Maulana Adnan");
        binding.txtDescription3.setText("Hello!.. Nama Saya Maulana Adnan Khalid, Stambuk F55119028.. Saya tinggal di jalan lorong gelatik No.23 Palu");
    }
}

package com.example.inspirian;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav);
        navView.setOnNavigationItemSelectedListener(nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener nav=new BottomNavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            switch (item.getItemId()){
                case R.id.navigation_home:
                    HomeFragment homeFragment=new HomeFragment();
                    fragmentTransaction.replace(R.id.frame,homeFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_courses:
                    courses Fragment =new courses();
                    fragmentTransaction.replace(R.id.frame,Fragment);
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_testimonials:
                  Testimonals TestimonialFragment=new Testimonals();
                    fragmentTransaction.replace(R.id.frame,TestimonialFragment);
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_contact:
                    ContactUs ContactFragment=new ContactUs();
                    fragmentTransaction.replace(R.id.frame,ContactFragment);
                    fragmentTransaction.commit();
                    return true;
            }
            return false;
        }
    };
}

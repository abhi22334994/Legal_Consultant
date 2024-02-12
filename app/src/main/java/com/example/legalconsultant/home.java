package com.example.legalconsultant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.legalconsultant.fragment.account_frag;
import com.example.legalconsultant.fragment.category_frag;
import com.example.legalconsultant.fragment.home_frag;
import com.example.legalconsultant.fragment.search_frag;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class home extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bnv=findViewById(R.id.bnv);

        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id=item.getItemId();

                if(id==R.id.nav_home){
                   loadFrag(new home_frag(),true);
                }else if (id==R.id.nav_search){
                    loadFrag(new search_frag(),false);
                } else if (id==R.id.nav_category) {
                    loadFrag(new category_frag(),false);
                } else{
                    loadFrag(new account_frag(),false);
                }

                return true;
            }
        });
        bnv.setSelectedItemId(R.id.nav_home);
    }
    public void loadFrag(Fragment fragment,boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag)
            ft.add(R.id.container,fragment);
        else
            ft.replace(R.id.container,fragment);
        ft.commit();
    }
}
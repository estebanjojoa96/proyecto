package com.example.estebanjojoa.bottonnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView botto_navigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botto_navigation = (BottomNavigationView) findViewById(R.id.botton_navigation);
        botto_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Item_prom:
                         PromotionFragment promotionFragment = new PromotionFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, promotionFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.Item_market:
                        SupermarketFragment supermarketFragment = new SupermarketFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, supermarketFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.Item_fav:
                        FavoritesFragment favoritesFragment = new FavoritesFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, favoritesFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;

                    case R.id.Item_user:
                        ProfileFragment profileFragment = new ProfileFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                }
                return true;
            }

        });

    }

}

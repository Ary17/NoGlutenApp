package com.example.noglutenappandroid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int nrFragments;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        nrFragments=behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FavoritesFragment();
        }

        else if(position==1){
            return new HomeFragment();
        }

        else if(position==2){
            return new YourRecipesFragment();
        }

        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return nrFragments;
    }
}

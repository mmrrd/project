package com.riya.livecricket;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.riya.livecricket.fragment.FantasyFragment;
import com.riya.livecricket.fragment.IplFragment;
import com.riya.livecricket.fragment.MatchFragment;
import com.riya.livecricket.fragment.NewsFragment;

public class Pager extends FragmentStatePagerAdapter {
    
    //integer to count number of tabs
    int tabCount;
 
    //Constructor to the class 
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }
 
    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs 
        switch (position) {
            case 0:
                MatchFragment tab1 = new MatchFragment();
                return tab1;
            case 1:
                IplFragment tab2 = new IplFragment();
                return tab2;
            case 2:
                FantasyFragment tab4 = new FantasyFragment();
                return tab4;
            case 3:
                NewsFragment tab3 = new NewsFragment();
                return tab3;

            default:
                return null;
        }
    }
 
    //Overriden method getCount to get the number of tabs 
    @Override
    public int getCount() {
        return tabCount;
    }
}
 
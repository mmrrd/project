package com.riya.livecricket;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

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
                MatchFragment tab2 = new MatchFragment();
                return tab2;
            case 2:
                MatchFragment tab3 = new MatchFragment();
                return tab3;
            case 3:
                MatchFragment tab4 = new MatchFragment();
                return tab4;
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
 
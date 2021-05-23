package com.example.viewpagertabactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import Fragments.Calls_Fragment;
import Fragments.Chat_Fragment;
import Fragments.Status_Fragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0: return new Chat_Fragment();
            case 1: return new Status_Fragment();
            case 2: return new Calls_Fragment();

            default:return new Chat_Fragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        if (position == 0)
        {
            title = "CHATS";
        }
        else if (position == 1)
        {
            title = "STATUS";
        }
        else if (position == 2)
        {
            title = "CALLS";
        }
        return title;
    }
}

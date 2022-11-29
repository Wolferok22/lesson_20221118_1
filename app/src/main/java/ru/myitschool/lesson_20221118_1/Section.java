package ru.myitschool.lesson_20221118_1;

import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.Arrays;

public class Section implements Item
{
    private  final String name;

    public Section(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void onClick(View view)
    {
        Snackbar.make(view,name, BaseTransientBottomBar.LENGTH_SHORT).show();
    }
    public void addSection(Section section){
        sections = Arrays.copyOf(section, section.length+1);
        section[section.length-1] = unit;
}

package ru.myitschool.lesson_20221118_1;

import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public abstract class Unit implements Item

{
    private String name ;
    private String phone;

    public static int id;

    public abstract String Speak();



    {
        name = "test";
        phone = "1234567890";

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public static int getCount()
    {
        return id;
    }

    public static void setCount(int id)
    {
        Unit.id = id;
    }

    public Unit(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
        id++;
    }
    public Unit(){
        id++;
    }

    @Override
    public void onClick(View view)
    {
        Snackbar.make(view,
                Speak() +" | "+name+": "+phone,
                Snackbar.LENGTH_SHORT).show();
    }
}

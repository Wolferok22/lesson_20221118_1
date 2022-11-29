package ru.myitschool.lesson_20221118_1;

import java.util.Arrays;

public class ListRepa
{
    private static Item[] units = new Item[0];

    public  Unit[] getUnits()
    {
        return units;
    }


    public void addSection(Section section){
        addItem(section);
    }
    private void  addItem(Item item){
            units = Arrays.copyOf(units, units.length+1);
            units[units.length-1] = item;
    }

}

package ru.myitschool.lesson_20221118_1;

public class Senior extends Unit
{
    @Override
    public String Speak()
    {
        return "I'm senior";
    }

    public Senior(String name, String phone)
    {
        super(name, phone);
    }

    public Senior()
    {
    }
}

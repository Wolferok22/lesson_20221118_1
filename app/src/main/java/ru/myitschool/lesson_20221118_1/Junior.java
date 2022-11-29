package ru.myitschool.lesson_20221118_1;

public class Junior extends Unit
{
    @Override
    public String Speak()
    {
        return "I'm junior";
    }

    public Junior(String name, String phone)
    {
        super(name, phone);
    }

    public Junior()
    {
    }
}

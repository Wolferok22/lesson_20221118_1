package ru.myitschool.lesson_20221118_1;

public class Middle extends Unit
{
    @Override
    public String Speak()
    {
        return "I'm middle";
    }

    public Middle(String name, String phone)
    {
        super(name, phone);
    }

    public Middle()
    {
    }
}

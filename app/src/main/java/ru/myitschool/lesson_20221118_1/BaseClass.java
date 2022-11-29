package ru.myitschool.lesson_20221118_1;

public abstract class BaseClass
{
    abstract String getName();
    abstract String getHealth();
    abstract void print();


}


abstract interface Attack{
    int mana = 200;
    void attack();

}
abstract interface Defend{
    void defend();
}
class Warrior extends BaseClass implements Attack, Defend{

    @Override
    String getName()
    {
        return null;
    }

    @Override
    String getHealth()
    {
        return null;
    }

    @Override
    void print()
    {

    }

    @Override
    public void attack()
    {

    }

    @Override
    public void defend()
    {

    }
}


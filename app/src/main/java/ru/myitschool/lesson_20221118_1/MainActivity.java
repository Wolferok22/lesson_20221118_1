package ru.myitschool.lesson_20221118_1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import ru.myitschool.lesson_20221118_1.databinding.ActivityMainBinding;
import ru.myitschool.lesson_20221118_1.databinding.ItemUserBinding;

public class MainActivity extends AppCompatActivity
{
    ActivityMainBinding binding;
    ItemUserBinding itemUserBinding;


    static int count = 0;

    private final ListRepa repa = new ListRepa();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fillList();
        //setContentView(R.layout.activity_main);
//        binding.outputText.setText("Hello");
        binding.add2.setOnClickListener(view -> addContact());

        binding.container.setOnClickListener(view ->
        {
            String text = itemUserBinding.llayout.findViewById(R.id.name).toString();
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        });


    }


    private void clearInput()
    {
        binding.inputName.setText("");
        binding.inputPhone.setText("");
        binding.inputName.clearFocus();
        binding.inputPhone.clearFocus();
        binding.radioGroup.clearCheck();

    }

    private void addContact()
    {
        {
            count++;
            String name = binding.inputName.getText().toString();
            String phone = binding.inputPhone.getText().toString();
            boolean isJunior = binding.juniorR.isChecked();
            boolean isMiddle = binding.middleR.isChecked();
            boolean isSenior = binding.seniorR.isChecked();
            Unit unit;
            if (
                    !name.isEmpty()
                            && !phone.isEmpty()
                            && (isJunior || isMiddle || isSenior))
            {
                if (isJunior)
                {
                    unit = new Junior(name, phone);
                }
                else if (isMiddle)
                {
                    unit = new Middle(name, phone);
                }
                else
                {
                    unit = new Senior(name, phone);
                }
                repa.addUnit(unit);

                fillList();
                clearInput();

            }
            else
            {
                Snackbar.make(binding.getRoot(),
                        "Заполните все поля",
                        Snackbar.LENGTH_LONG).show();
                //Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show();
            }
        }

    }

    private void fillList()
    {
        binding.container.removeAllViews();
        for (Unit unit : repa.getUnits())
        {
            if(item instanceof Unit){
            ItemUserBinding itemUserBinding = ItemUserBinding.inflate(getLayoutInflater());
            itemUserBinding.name.setText(Unit.id + " " + unit.getName());
            itemUserBinding.phone.setText(unit.getPhone());
            itemUserBinding.status.setText(unit.Speak());
            binding.container.addView(itemUserBinding.getRoot());}
            else if (item instanceof Section){
                Section section = (Section) item;

            }

            //TODO fix onClick
        }

//                binding.outputText.append(name + "\n" + phone + "\n");

    }

}
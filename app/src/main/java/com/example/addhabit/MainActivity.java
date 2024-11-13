package com.example.addhabit;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tambahkan HabitListFragment dan AddHabitFragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.habit_list_container, new HabitListFragment())
                    .replace(R.id.add_habit_container, new AddHabitFragment())
                    .commit();
        }
    }
}
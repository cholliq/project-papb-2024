package com.example.addhabit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class HabitViewModel extends ViewModel {
    private final MutableLiveData<List<Habit>> habits = new MutableLiveData<>(new ArrayList<>());

    public LiveData<List<Habit>> getHabits() {
        return habits;
    }

    public void addHabit(String namaHabit, String tanggal, String isiJurnal) {
        List<Habit> currentHabits = habits.getValue();
        currentHabits.add(new Habit(namaHabit, tanggal, isiJurnal));
        habits.setValue(currentHabits);
    }
}

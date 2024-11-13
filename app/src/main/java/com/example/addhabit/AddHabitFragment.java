package com.example.addhabit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class AddHabitFragment extends Fragment {

    private HabitViewModel habitViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_habit, container, false);
        habitViewModel = new ViewModelProvider(requireActivity()).get(HabitViewModel.class);

        EditText habitNameInput = view.findViewById(R.id.habit_name_input);
        EditText habitDateInput = view.findViewById(R.id.habit_date_input); // input baru untuk tanggal
        EditText habitJournalInput = view.findViewById(R.id.habit_journal_input); // input baru untuk isi jurnal
        Button addButton = view.findViewById(R.id.add_habit_button);

        addButton.setOnClickListener(v -> {
            String name = habitNameInput.getText().toString().trim();
            String date = habitDateInput.getText().toString().trim();
            String journal = habitJournalInput.getText().toString().trim();

            if (!name.isEmpty() && !date.isEmpty() && !journal.isEmpty()) {
                habitViewModel.addHabit(name, date, journal);
                habitNameInput.setText("");
                habitDateInput.setText("");
                habitJournalInput.setText("");
                Toast.makeText(getActivity(), "Habit added!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "Please fill all fields.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

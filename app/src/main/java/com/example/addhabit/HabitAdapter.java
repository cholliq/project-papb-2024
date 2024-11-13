package com.example.addhabit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HabitAdapter extends RecyclerView.Adapter<HabitAdapter.HabitViewHolder> {

    private List<Habit> habits;

    public void setHabits(List<Habit> habits) {
        this.habits = habits;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HabitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habit, parent, false);
        return new HabitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HabitViewHolder holder, int position) {
        Habit habit = habits.get(position);
        holder.tvNamaHabit.setText(habit.getNamaHabit());
        holder.tvTanggal.setText(habit.getTanggal());
        holder.tvIsiJurnal.setText(habit.getIsiJurnal());
    }

    @Override
    public int getItemCount() {
        return (habits != null) ? habits.size() : 0;
    }

    static class HabitViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaHabit, tvTanggal, tvIsiJurnal;

        HabitViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaHabit = itemView.findViewById(R.id.tvNamaHabit);
            tvTanggal = itemView.findViewById(R.id.tvTanggal);
            tvIsiJurnal = itemView.findViewById(R.id.tvIsiJurnal);
        }
    }
}

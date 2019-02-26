package me.nakeeb.datepicker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Date;

public class DatePickerAdapter extends RecyclerView.Adapter<DatePickerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Date> dates;

    public DatePickerAdapter(Context context, ArrayList<Date> dates){
        this.context = context;
        this.dates = dates;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.date_picker_day_item, parent, false);

        if (viewType == 0){
            view.setVisibility(View.INVISIBLE);
        }
        else {
            view.setVisibility(View.VISIBLE);
        }


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return dates.size() + 4;
    }

    @Override
    public int getItemViewType(int position) {

        int size = dates.size();

        if (position == 0)
            return 0;
        else if (position == 1)
            return 0;
        else if (position == size + 2)
            return 0;
        else if (position == size + 3)
            return 0;
        else
            return 1;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView month, day;

        public ViewHolder(View itemView) {
            super(itemView);

            month = itemView.findViewById(R.id.monthTV);
            day = itemView.findViewById(R.id.dayTV);
        }
    }
}

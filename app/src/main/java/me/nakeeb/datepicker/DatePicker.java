package me.nakeeb.datepicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Date;

public class DatePicker extends AppCompatActivity {

    Spinner monthSpinner;
    RecyclerView daysRV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_picker);

        monthSpinner = findViewById(R.id.monthSpinner);
        daysRV = findViewById(R.id.pickerRV);


        daysRV.setLayoutManager(new CenterZoomLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Date> dates = new ArrayList<>();

        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());
        dates.add(new Date());

        daysRV.setAdapter(new DatePickerAdapter(this, dates));

        SnapHelper snapHelper = new LinearSnapHelper();

        snapHelper.attachToRecyclerView(daysRV);

        daysRV.smoothScrollBy(2, 0);
    }
}

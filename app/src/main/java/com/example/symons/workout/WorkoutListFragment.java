package com.example.symons.workout;


import android.app.Activity;
import android.os.Bundle;
import android.app.ListFragment;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {
    static interface WorkoutListListener{
        void itemClicked(long id);
    };
    private WorkoutListListener listListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Workout.workouts.length];
        for(int i=0; i <names.length;i++){
            //create string array of names
            names[i] = Workout.workouts[i].getName();
        }
        //create an array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listListener = (WorkoutListListener)activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listListener != null){
            listListener.itemClicked(id);
        }
    }
}

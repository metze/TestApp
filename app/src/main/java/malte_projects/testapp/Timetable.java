package malte_projects.testapp;

import android.os.Bundle;

/**
 * Created by malte on 31.05.2016.
 */
public class Timetable extends MainActivity{
    protected String getName() {
        return getString(R.string.nav_timetable);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
    }
}

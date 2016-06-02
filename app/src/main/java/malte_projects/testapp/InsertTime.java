package malte_projects.testapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

/**
 * Created by malte on 31.05.2016.
**/

// Neue Zeit in die Stats eintragen
public class InsertTime extends MainActivity{
    protected String getName() {
        return getString(R.string.nav_insert_time);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_time);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }
}

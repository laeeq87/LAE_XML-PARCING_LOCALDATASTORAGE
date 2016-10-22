package example.itsme.xmlparcing;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toursPullParcer parcer=new toursPullParcer();
        List<tours> tours=parcer.parseXML(MainActivity.this);

        ArrayAdapter<tours> adapter=new ArrayAdapter<example.itsme.xmlparcing.tours>(MainActivity.this,
               android.R.layout.simple_list_item_1,tours);
        setListAdapter(adapter);


    }
}

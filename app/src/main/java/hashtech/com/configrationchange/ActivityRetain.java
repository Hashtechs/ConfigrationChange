package hashtech.com.configrationchange;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivityRetain extends AppCompatActivity implements View.OnClickListener {


    int counter;
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retaination);
        tvText = (TextView) findViewById(R.id.tvTexts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);

        Object retainedObject = getLastCustomNonConfigurationInstance();
        if (retainedObject != null) {
            counter = (int) retainedObject;
        }

        tvText.setText(String.valueOf(counter));

    }


    @Override
    public void onClick(View view) {
        Snackbar.make(view, "Hi I'm a SnackBar i'm Adding 1", Snackbar.LENGTH_LONG)
                .setAction("Ok !!", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // This is activated when you click on Ok
                    }
                }).show();
        tvText.setText(String.valueOf(++counter));
    }




    @Override
    public Object onRetainCustomNonConfigurationInstance() {

        return counter;
    }
}

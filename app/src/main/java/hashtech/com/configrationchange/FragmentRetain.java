package hashtech.com.configrationchange;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentRetain extends Fragment implements View.OnClickListener {

    private static final String TAG = "FragmentRetain";
    private TextView textView;
    private int counter;

    public FragmentRetain() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_retain, container, false);

        // notice how we get this view from Activity's layout cause its exist there
        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);

        fab.setOnClickListener(this);
        textView = (TextView) v.findViewById(R.id.tvTexts);
        textView.setText(String.valueOf(counter));

        return v;

    }

    @Override
    public void onClick(View view) {

        textView.setText(String.valueOf(++counter));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}

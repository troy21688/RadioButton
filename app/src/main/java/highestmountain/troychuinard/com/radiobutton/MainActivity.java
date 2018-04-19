package highestmountain.troychuinard.com.radiobutton;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton;

    private TextView mShowChoice;
    private Button mSHowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowChoice = (TextView) findViewById(R.id.answer_view);
        mSHowButton = (Button) findViewById(R.id.check_button);

        mRadioGroup = (RadioGroup) findViewById(R.id.radio_group_id);

        mSHowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedOptions = mRadioGroup.getCheckedRadioButtonId();

                mRadioButton = (RadioButton) findViewById(selectedOptions);

                mShowChoice.setText(mRadioButton.getText());


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

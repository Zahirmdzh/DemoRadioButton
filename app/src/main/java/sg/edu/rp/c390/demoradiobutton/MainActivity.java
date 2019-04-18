package sg.edu.rp.c390.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get RG object
                RadioGroup rg = findViewById(R.id.radioGroup1);
                //get id of selected radio button in radiogroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                //get radio button ojet from id we had gotten above
                RadioButton rb = findViewById(selectedButtonId);

                Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();
            };

        });
    }
}

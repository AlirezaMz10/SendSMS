package ir.mz10.sendsms2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtNumber = findViewById(R.id.edtNumber);
        EditText edtText = findViewById(R.id.edtText);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = edtNumber.getText() + "";
                String t = edtText.getText() + "";

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(n,null,t,null,null);


            }
        });
    }
}
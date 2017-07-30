package am.ysu.ysu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import am.ysu.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_dasacucak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button_dasacucak = (Button)findViewById(R.id.button_dasacucak);
        button_dasacucak.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}

package com.project.aaron.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ButterKnifeExmaple";
    @BindView(R.id.mTextView)
    TextView textView;

    @BindView(R.id.mEditText)
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        textView.setText("Aaron Revilla");
        editText.setText("Butter Knife example");

    }

    @OnClick(R.id.mButton)
    public void doMagic(){
        Log.d(TAG, "doMagic: button pressed " + editText.getText());
    }
}

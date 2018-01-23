package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBotButton;
    private int mStoryState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mStoryTextView.setText(R.string.T1_Story);

        mTopButton = (Button) findViewById(R.id.buttonTop);
        mTopButton.setText(R.string.T1_Ans1);
        mTopButton.setVisibility(View.VISIBLE);

        mBotButton = (Button) findViewById(R.id.buttonBottom);
        mBotButton.setText(R.string.T1_Ans2);
        mBotButton.setVisibility(View.VISIBLE);

        mStoryState = 1;

        Toast.makeText(this, "Rotatate Your Phone To Restart the Story", Toast.LENGTH_LONG).show();


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( mStoryState == 1) {
                    mStoryState = 3;
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBotButton.setText(R.string.T3_Ans2);
                } else if (mStoryState == 2) {
                    mStoryState = 3;
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBotButton.setText(R.string.T3_Ans2);
                } else {
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBotButton.setVisibility(View.INVISIBLE);
                    mStoryTextView.setText(R.string.T6_End);
                }
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryState == 1) {
                    mStoryState = 2;
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBotButton.setText(R.string.T2_Ans2);
                } else if (mStoryState == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBotButton.setVisibility(View.INVISIBLE);
                } else {
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBotButton.setVisibility(View.INVISIBLE);
                }
            }
        });


    }
}

package local.uri.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import local.uri.destini.States.State1;

public class MainActivity extends AppCompatActivity {

    public TextView mTextView;
    public Button mTopButton;
    public Button mBottomButton;
    public StateInterface mCurrentState;


    public TextView getTextView() {
        return mTextView;
    }

    public Button getTopButton() {
        return mTopButton;
    }

    public Button getBottomButton() {
        return mBottomButton;
    }

    public void setCurrentState(StateInterface currentState) {
        this.mCurrentState = currentState;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mCurrentState = new State1(this);

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentState.updateTopButton();
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentState.updateBottomButton();
            }
        });
    }
}

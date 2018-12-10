package local.uri.destini.States;

import android.app.Activity;

import local.uri.destini.R;
import local.uri.destini.StateAbstract;
import local.uri.destini.StateInterface;

public class State1 extends StateAbstract implements StateInterface {

    public State1(Activity activity) {
        super(activity);
    }

    private void updateText(int resID) {
        mTextView.setText(resID);
    }

    @Override
    public void updateTopButton() {
        updateState(new State3(mainActivity));
        updateText(R.string.T3_Story);
        mTopButton.setText(R.string.T3_Ans1);
        mBottomButton.setText(R.string.T3_Ans2);
    }

    @Override
    public void updateBottomButton() {
        updateState(new State2(mainActivity));
        updateText(R.string.T2_Story);
        mTopButton.setText(R.string.T2_Ans1);
        mBottomButton.setText(R.string.T2_Ans2);
    }

    private void updateState(StateInterface stateInterface) {
        mainActivity.setCurrentState(stateInterface);
    }
}

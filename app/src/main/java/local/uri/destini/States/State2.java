package local.uri.destini.States;

import android.app.Activity;
import android.view.View;

import local.uri.destini.R;
import local.uri.destini.StateAbstract;
import local.uri.destini.StateInterface;

public class State2 extends StateAbstract implements StateInterface {

    public State2(Activity activity) {
        super(activity);
    }

    private void updateText(int resID) {
        mTextView.setText(resID);
    }

    @Override
    public void updateTopButton() {
        new State1(mainActivity).updateTopButton();
    }

    @Override
    public void updateBottomButton() {
        updateText(R.string.T4_End);
        mTopButton.setVisibility(View.GONE);
        mBottomButton.setVisibility(View.GONE);
        updateState(new End4(mainActivity));
    }

    private void updateState(StateInterface stateInterface) {
        mainActivity.setCurrentState(stateInterface);
    }
}

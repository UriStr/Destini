package local.uri.destini.States;

import android.app.Activity;
import android.view.View;

import local.uri.destini.R;
import local.uri.destini.StateAbstract;
import local.uri.destini.StateInterface;

public class State3 extends StateAbstract implements StateInterface {

    public State3(Activity activity) {
        super(activity);
    }

    private void updateText(int resID) {
        mTextView.setText(resID);
    }

    @Override
    public void updateTopButton() {
        updateText(R.string.T6_End);
        mTopButton.setVisibility(View.GONE);
        mBottomButton.setVisibility(View.GONE);
        updateState(new End6(mainActivity));
    }

    @Override
    public void updateBottomButton() {
        updateText(R.string.T5_End);
        mTopButton.setVisibility(View.GONE);
        mBottomButton.setVisibility(View.GONE);
        updateState(new End5(mainActivity));
    }

    private void updateState(StateInterface stateInterface) {
        mainActivity.setCurrentState(stateInterface);
    }
}

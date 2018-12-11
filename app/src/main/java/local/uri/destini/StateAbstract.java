package local.uri.destini;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public abstract class StateAbstract implements StateInterface {

    protected static TextView mTextView;
    protected static Button mTopButton;
    protected static Button mBottomButton;
    protected static MainActivity mainActivity;

    public StateAbstract(Activity activity) {
        this.mainActivity = (MainActivity) activity;
        this.mBottomButton = mainActivity.getBottomButton();
        this.mTopButton = mainActivity.getTopButton();
        this.mTextView = mainActivity.getTextView();
    }

    public abstract void updateTopButton();

    public abstract void updateBottomButton();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}

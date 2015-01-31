package pct.droid.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;

import pct.droid.activities.BaseActivity;
import pct.droid.activities.MediaDetailActivity;
import pct.droid.base.fragments.BaseStreamLoadingFragment;

public abstract class BaseDetailFragment extends Fragment {

    protected static final String DATA = "data";
    protected static final String COLOR = "palette_color";

    protected FragmentListener mCallback;
    protected int mPaletteColor;
    protected MediaDetailActivity mActivity;
    protected View mRoot;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof MediaDetailActivity)
            mActivity = (MediaDetailActivity)activity;
    }

    public interface FragmentListener {
        public void playStream(BaseStreamLoadingFragment.StreamInfo streamInfo);
    }

}

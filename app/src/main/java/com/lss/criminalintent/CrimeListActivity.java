package com.lss.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shuai on 16-6-13.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

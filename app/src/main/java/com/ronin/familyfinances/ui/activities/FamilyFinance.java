package com.ronin.familyfinances.ui.activities;

import android.support.v4.app.Fragment;
import com.ronin.familyfinances.ui.fragments.FamilyFinanceFragment;

public class FamilyFinance extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return FamilyFinanceFragment.newInstance();
    }
}

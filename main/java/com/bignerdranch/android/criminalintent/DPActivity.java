package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.Date;

/**
 * Created by cody on 12/3/2017.
 */

public class DPActivity extends SingleFragmentActivity{
    private static final String EXTRA_CDATE =
            "com.bignerdranch.android.criminalintent.crime_date";


    public static Intent newIntent(Context pContext, Date date) {
        Intent intent = new Intent(pContext,DPActivity.class);
        intent.putExtra(EXTRA_CDATE,date);
        return intent;
        }
    @Override
    protected Fragment createFragment(){
        Date date = (Date) getIntent().getSerializableExtra(EXTRA_CDATE);
        return DatePickerFragment.newInstance(date);
    }
}

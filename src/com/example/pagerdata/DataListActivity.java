package com.example.pagerdata;

import android.support.v4.app.Fragment;

public class DataListActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		
		return new DataListFragment();
	}


}

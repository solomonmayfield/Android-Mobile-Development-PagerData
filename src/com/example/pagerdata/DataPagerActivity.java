package com.example.pagerdata;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

public class DataPagerActivity extends FragmentActivity implements Constants
{
	private ViewPager viewPager;
	private ArrayList<String> data = DataSet.getInstance().getData();
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		viewPager = new ViewPager(this);
		viewPager.setId(R.id.viewPager);
		setContentView(viewPager);
		
		FragmentManager manager = getSupportFragmentManager();
		viewPager.setAdapter(new FragmentStatePagerAdapter(manager){

			@Override
			public Fragment getItem(int position) {
				//String item = data.get(position);
				return DataFragment.newInstance(position);
			}

			@Override
			public int getCount() {
				return data.size();
			}
			
		});
		
		viewPager.setOnPageChangeListener(new OnPageChangeListener(){

			@Override
			public void onPageScrollStateChanged(int arg0) {}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {}

			@Override
			public void onPageSelected(int pos) {
				String item = data.get(pos);
				setTitle(item);
			}
			
		});
		
		int id = getIntent().getIntExtra(EXTRA_DATA_ID, 0);
		viewPager.setCurrentItem(id);
	}
}
















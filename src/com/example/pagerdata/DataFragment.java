package com.example.pagerdata;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DataFragment extends Fragment implements Constants
{
	private String item;
	
	public static DataFragment newInstance(int id)
	{
		Bundle args = new Bundle();
		args.putInt(EXTRA_DATA_ID, id);
		DataFragment dFrag = new DataFragment();
		dFrag.setArguments(args);
		
		return dFrag;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		int id = getArguments().getInt(EXTRA_DATA_ID);
		
		item = DataSet.getInstance().getData().get(id);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.data_fragment, container, false);
		initTitle(view);
		return view;
	}
	
	private void initTitle(View view)
	{
		TextView textView = (TextView)view.findViewById(R.id.textview_data_title);
		textView.setText(item);
	}
	
}








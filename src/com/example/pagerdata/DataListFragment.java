package com.example.pagerdata;

import java.util.ArrayList;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DataListFragment extends ListFragment implements Constants
{
	ArrayList<String> data;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		data = DataSet.getInstance().getData();
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
		setListAdapter(adapter);
	}
	
	@Override
	public void onListItemClick(ListView listView, View view, int position, long id) {
		super.onListItemClick(listView, view, position, id);
		
		String item = (String)(getListAdapter()).getItem(position);
	
		Intent intent = new Intent(getActivity(), DataPagerActivity.class);
		intent.putExtra(EXTRA_DATA_ID, position);
		startActivity(intent);
	}
}







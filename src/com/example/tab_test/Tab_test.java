package com.example.tab_test;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class Tab_test extends Activity implements 
ActionBar.TabListener
{
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tab_test);
	final ActionBar actionBar=getActionBar();
	actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	actionBar.addTab(actionBar.newTab().setText("��Ա").setTabListener(this));
	actionBar.addTab(actionBar.newTab().setText("���").setTabListener(this));
	actionBar.addTab(actionBar.newTab().setText("���").setTabListener(this));
	actionBar.addTab(actionBar.newTab().setText("��").setTabListener(this));
	

}
}

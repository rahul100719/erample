package com.training.model;

import com.training.annotaion.DataTable;

@DataTable(tableName = "Manager")
public class Manager {

	int mgrId;
	String mgrName;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int mgrId, String mgrName) {
		super();
		this.mgrId = mgrId;
		this.mgrName = mgrName;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	
}

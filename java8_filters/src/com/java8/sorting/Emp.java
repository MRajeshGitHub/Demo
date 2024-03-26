package com.java8.sorting;

public class Emp {
	int eid;
	public String ename;
	long esal;
	public Emp(int eid, String ename, long esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	

}

package com.training.ofss.enums;

public enum DEPARTMENTS {
	
	HR("DEPT-01"), 
	OPERATIONS("DEPT-02"), 
	LEGAL("DEPT-03"), 
	MARKETING("DEPT-O4");

	DEPARTMENTS(String deptCode) {
		this.deptCode = deptCode;
	}

	private String deptCode;

	public String getDeptCode() {
		return deptCode;

	}

}

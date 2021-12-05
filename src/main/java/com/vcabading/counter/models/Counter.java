package com.vcabading.counter.models;

import javax.servlet.http.HttpSession;

/////////////////////////////////////////////////////////////
//	COUNTER CLASS
/////////////////////////////////////////////////////////////

public class Counter {
	
	private HttpSession session;
	
	//	//// CONSTRUCTORS ///////////////////////////////////
	
	public Counter() {
		session = new HttpSession();
	}
	
	//	//// ACTION /////////////////////////////////////////
	
	public void addCount() {
		if (session.getAttribute("count") == null) {
		    // Use setAttribute to initialize the count in session
			session.setAttribute("count", 1);
		}
		else {
		    // increment the count by 1 using getAttribute and setAttribute
			Integer count = this.getCount();
			session.setAttribute("count", count+1);
		}
	}
	
	//	//// GETTERS ////////////////////////////////////////
	
	public Integer getCount() {
	    return (Integer) session.getAttribute("count");
	}

}

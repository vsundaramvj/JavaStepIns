package com.mine.CollectionBegin;

import java.util.Comparator;

public class StudentCollection implements Comparator<StudentCollection>, Comparable<StudentCollection>{

	String name;
	int marks;
	
	@Override
	public int compare(StudentCollection o1, StudentCollection o2) {

		return o1.marks>o2.marks?-1:(o1.marks<o2.marks?1:0);
	}

	@Override
	public int compareTo(StudentCollection o) {
		// TODO Auto-generated method stub
		return  this.marks>o.marks?-1:(this.marks<o.marks?1:0);
	}

}

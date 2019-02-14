package com.mine.PackagesUnderstanding.packageMain;

import com.mine.PackagesUnderstanding.package1.*;

import static com.mine.PackagesUnderstanding.package2.DemoClass.*;

public class DemoPackageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.mine.PackagesUnderstanding.package1.DemoClass demo1 = new DemoClass();
		com.mine.PackagesUnderstanding.package2.DemoClass demo2 = new com.mine.PackagesUnderstanding.package2.DemoClass();
		demo1.show();
		demo2.show();
		System.out.println("PI:: "+PI);
		System.out.println("com.mine.PackagesUnderstanding.package1.DemoClass:: "+com.mine.PackagesUnderstanding.package1.DemoClass.PI);
	}

}

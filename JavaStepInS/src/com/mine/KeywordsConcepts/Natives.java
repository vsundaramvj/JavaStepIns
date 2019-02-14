package com.mine.KeywordsConcepts;

public class Natives {
	//JNI --> Java Native INterface
	static{
		System.loadLibrary("LibC.dll");
	}
	public native void checkC();
}

class LoadNatives {
	
	public static void main(String args[])
	{
		Natives n = new Natives();
		n.checkC();
	}
}
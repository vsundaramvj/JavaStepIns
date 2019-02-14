package com.mine.StringMaster;

public class StringBufferMasteringMain {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("stringBuffer1");

		System.out.println("str buffer: "+str);
		System.out.println("str  # : "+str.hashCode());
		/* String Buffer is mutuable: */
		StringBuffer stringBuffer1 = new StringBuffer("stringBuffer1");
		StringBuffer stringBuffer2 = new StringBuffer("stringBuffer2");
		System.out.println("stringBuffer1  # : "+stringBuffer1.hashCode());
		System.out.println("stringBuffer2  # : "+stringBuffer2.hashCode());

		stringBuffer1 = stringBuffer2;

		System.out.println("stringBuffer1  # : "+stringBuffer1.hashCode());
		System.out.println("stringBuffer2  # : "+stringBuffer2.hashCode());

		stringBuffer1 = str;
		System.out.println("stringBuffer1  # : "+stringBuffer1.hashCode());
		stringBuffer1 = new StringBuffer("stringBuffer1");

		System.out.println("stringBuffer1  # : "+stringBuffer1.hashCode());
		
		//memory taking:
		
		StringBuffer  stringBuffer5 = new StringBuffer("a");
				System.out.println("string5: "+stringBuffer5);
				for(int i=0;i<100;i++)
				{
					stringBuffer5 = stringBuffer5.append("a");
				}
				StringBuffer  stringBuffer6 = new StringBuffer("ninja");
				System.out.println("stringBuffer6: "+stringBuffer6);
				stringBuffer6.reverse();
				System.out.println("stringBuffer6: "+stringBuffer6+stringBuffer2);
				
			StringBuilder sb = new StringBuilder("sdde");
			System.out.println("sb: "+sb);
			System.out.println("stringBuffer6: "+stringBuffer6+stringBuffer2+sb);
			
				
	}
}

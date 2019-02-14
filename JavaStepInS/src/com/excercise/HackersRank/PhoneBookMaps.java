package com.excercise.HackersRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMaps {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
           
            // Write code here
        }
        
        List<String> outputList = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
                        
            // Write code here
            if(phoneBook.containsKey(s))
            {
            	outputList.add(s+"="+phoneBook.get(s));
            }
            else
            {
            	outputList.add("Not found");
            }
           
        }
        in.close();
        
       Iterator<String> display = outputList.iterator();
       while(display.hasNext()){
    	   System.out.println(display.next());
       }
     
    }
}

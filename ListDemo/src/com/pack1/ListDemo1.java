package com.pack1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
			
		List lst=new ArrayList();
		lst.add(89);
		lst.add(83.23);
		lst.add("ram");		
		//cannot sort 
		//complex iteration 
		// explict type casting required
		for(Object obj:lst)
		{
			if(obj instanceof Integer)
			{
				int val=(int)obj;
				System.out.println(val+2);
			}else if(obj instanceof String)
			{
				String s=(String)obj;
				System.out.println(s);
			}else{
				
			}
		}
		
	}

}

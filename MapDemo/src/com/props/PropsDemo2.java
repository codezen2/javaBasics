package com.props;

import java.util.Properties;
import java.util.Set;

public class PropsDemo2 {

	public static void main(String[] args) {
		
		//sysrem properties set by JVM
		Properties prop=System.getProperties();
		Set<Object> keys=prop.keySet();
		for(Object key:keys)
			System.out.println(key+" => "+prop.getProperty((String) key));
	}

}

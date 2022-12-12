package support;

import org.apache.commons.lang3.ArrayUtils;

public class Test {

	public static void main(String[] args) throws Exception {

		System.out.println(ArrayUtils.toString(" ".getBytes()));  // en half
		
		System.out.println(ArrayUtils.toString("　".getBytes())); // en full
		
		System.out.println(ArrayUtils.toString(" ".getBytes())); // cn half 
		
		System.out.println(ArrayUtils.toString("　".getBytes())); // cn half 
		
		
		
		
		System.out.println(ArrayUtils.toString(" ".getBytes()));
	}

}
 
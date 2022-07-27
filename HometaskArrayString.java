package com.incubation;

public class HometaskArrayString {

	public void smallLargeNumber() {
		int[] a = { 2, 3, 6, 1, 4 };
		int large = a[0];
		int small = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];
			}
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println("Smallest no : " + small);
		System.out.println("latgest no : " + large);
	}

	public void missingNumber() {
		int[] a = { 1, 2, 3, 4, 8, 10, 12, 15 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + 1;
			if (sum != a[i]) {
				for (int j = sum; j < a[i]; j++) {
					System.out.println("Missing no : " + j);
				}
				sum = a[i];
			}
		}
	}

	public void duplicateCharacter() {
		String str = "Happy Happy";
		int count;
	    for(int i=0;i<str.length();i++) {
	      count = 1;
	      char c = str.charAt(i);
	      if(c == ' ') 
	        continue;
	      for(int j=i+1;j<str.length();j++) {
	        if(c == str.charAt(j)) {
	          count++;
	          str = str.substring(0, j) + str.substring(j+1);	          
	        }
	      }
	      if(count > 1) {
	          System.out.println(c + " character found " + count + " times");
	        }
	    }
}
	
	public void rotationString() {
		String str = "Nitin", str2 = "";
		int c = str.length()-1;
		for(int i=c;i>=0;i--) {
			str2 = str2 + str.charAt(i); 
		}
		if (str.toLowerCase().equals(str2.toLowerCase())) {
			System.out.println("String is rotation of given string");
		}
		else {
			System.out.print("Not rotational");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HometaskArrayString ht = new HometaskArrayString();
		ht.smallLargeNumber();
		ht.missingNumber();
		ht.duplicateCharacter();
		ht.rotationString();
	}
}
	
	
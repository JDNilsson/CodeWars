package katas.kyu6;

import java.util.TreeSet;

/*
  Given an array of integers, find the one that appears an odd number of times.

  There will always be only one integer that appears an odd number of times.
*/

public class FindOdd {

  

	public static int findIt(int[] a) {

    TreeSet<Integer> intSet = new TreeSet<Integer>();
  	
    for(int i=0;i<a.length;i++) {
      if(!intSet.contains(a[i])) {
        intSet.add(a[i]);
      }
      else{
        intSet.remove(a[i]);
      }
    }

    return intSet.first();
  }




}
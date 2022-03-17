package com.weeklycodingchallenge;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SinglylinkedList {

	public static void main(String[] args) {
		
		
	List<Integer> A = new LinkedList<Integer>();
	
	A.add(3);
	A.add(7);
	A.add(8);
	A.add(10);
	
	List<Integer> B= new LinkedList<Integer>();
	
	
	B.add(99);
	B.add(1);
	B.add(8);
	B.add(10);
	
	HashSet<Integer> hashSet = new HashSet<>();
    for (Integer i : A)
    {
        hashSet.add(i);
    }
    for (Integer j : B)
    {
        if (hashSet.contains(j))
        {
            System.out.println("intersection found for element : "+j);
            break;
        }
    }
	
}
}
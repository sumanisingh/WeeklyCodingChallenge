package com.weeklycodingchallenge;

import java.util.Stack;

public class StackImplementation {
	
		private static void Push(Stack<String> val) {
			
			val.push("v");
			val.push("a");
			val.push("1");
			}
			
		public static void Pop(Stack<String> val) {

			try {
				if(val==null) {
					throw new NullPointerException();
				}
				else 
					val.pop();
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			System.out.println(val);
			
		}
		
		public static void Max(Stack<String> val) {

			try {
				if(val==null) {
					throw new NullPointerException();
				}
				else 
					val.peek();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println(val.peek());
			
		}
		public static void main(String[]args) {
			Stack <String> val = new Stack<>();	
		   Push(val);
		   Pop(val);
		   Max(val);
		
	}

		
		}
		
		

	


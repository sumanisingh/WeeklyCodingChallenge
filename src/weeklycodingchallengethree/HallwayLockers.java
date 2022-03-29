package weeklycodingchallengethree;

import java.util.Arrays;

public class HallwayLockers {

	public static void main(String[] args) {

		 /*boolean [] lockers = new boolean [101];

  for(int i = 1; i < lockers.length; i++) {
 lockers[i] = true;
 }
 for(int i = 2; i < lockers.length; i += 2) {
 lockers[i] = false;
  }
  for(int i = 3; i < lockers.length; i++) { 
	  for(int j = 1; j < lockers.length;j++) { 
		  if(j % i == 0) lockers[j] =! lockers[j]; 
		  }}
 
  System.out.print("Open lockers: ");
  for(int i = 1; i < lockers.length; i++)
	  if(lockers[i]) { 
	  System.out.print(" " + i); 
 } 
 }
 } */
		  int[] arr = new int[100];
	        Arrays.fill(arr,0); //0= closed, 1 = open
	        for (int i = 1;i<=100;i++)
	        {
	            for (int j=i;j<=100;j+=i)
	            {
	                if (arr[j-1] == 0)
	                    arr[j-1] = 1;
	                else
	                    arr[j-1] = 0;
	            }
	        }
	        int count=0;
	        for (int i=0;i< arr.length;i++){
	            if (arr[i]==1)
	                count++;
	        }
	        System.out.println("No. of lockers open after 100th pass : "+count);
	    }
}
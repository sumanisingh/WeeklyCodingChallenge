package weeklycodingchallengethree;

public class HallwayLockers {

	public static void main(String[] args) {

		/*
		 * boolean[] lockers = new boolean [100];
		 * 
		 * for(int i=0;i<=lockers.length;i++) { for(int j=i;j<lockers.length;j+=i) {
		 * if(lockers[j]==true) { lockers[j]=false; }else { lockers[j]=true; } } }
		 * for(int i=0;i<lockers.length;i++) { System.out.println(lockers[i] +" " + i);
		 * }
		 * 
		 * } }
		 */
 boolean [] lockers = new boolean [101];

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
 } 

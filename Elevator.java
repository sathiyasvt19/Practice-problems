
//currentFloor =4 
//totalFloor=9
//0 <= currentFloor <= totalFloor-1
//str=UUFFDUDDF (U-1 floor up,D-1 floor down F-Perivious opperatin fail)
//output=4

import java.util.*;
public class Elevator {
	int totalFloor,currentFloor;
	String cf,str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator e = new Elevator();
		e.getInput();
		e.getFinalFloor();
	}
	//Get current floor,totla number of floor and sequence of operation. 
	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the current floor:");
		cf=scan.nextLine();
		System.out.println("Please enter the total number of floor:");
		totalFloor=scan.nextInt();
		System.out.println("Please Enter theElevator operation");
		scan.nextLine();
		str=scan.nextLine();	
	}
	//produce the destination floor after sequence of operation
	void getFinalFloor() {
		currentFloor=Integer.valueOf(cf);
		char ch[] = str.toCharArray();
		for(int i=1;i<ch.length;i++) {
			if(ch[i-1]=='U' && currentFloor+1<totalFloor && ch[i]!='F') {
				currentFloor++;
			}
			else if(ch[i-1]=='D' && currentFloor-1>=0 && ch[i]!='F') {
				currentFloor--;
			}
		}
		if(currentFloor==0)
			System.out.println("G");
		else
			System.out.println(currentFloor);	
	}
}

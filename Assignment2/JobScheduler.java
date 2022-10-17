package Assignment2;
import java.util.*;
public class JobScheduler {
	int i, j;
	private int noofprocess=0;
	private int n=2;
	private int[][] process;
	private int[] completionTime;
	private int[] turnAroundTime;
	private int[] waitingTime;
	Scanner input = new Scanner(System.in);
	
	public void getInput(){
		System.out.print("Enter the number of process: ");
		this.noofprocess = input.nextInt();
		process = new int[noofprocess][n];
		for(i=0; i < noofprocess; i++){
			System.out.println("AT and BT for process " + (i+1));
			for( j = 0; j < n ; j++){				
				process[i][j] = input.nextInt();
			}
		}
	}
	
	private void getOutput(String s, int []arr){
		System.out.println();
		System.out.println(s+" Time of processes are:");
		for(i=0;i<noofprocess;i++){
			System.out.println("P"+(i+1)+" = "+arr[i]);
		}
	}
	
	private void calcCompletionTime(){
		completionTime = new int[noofprocess];
		
		completionTime[0] = process[0][1];
		for(i = 1 ; i < noofprocess; i++){
			if ( process[i][0] > (process[i-1][0] +process[i-1][1])){
				completionTime[i] = process[i][0] + process[i][1];
			}
			else{
				completionTime[i] = completionTime[i-1]+process[i][1];
			}
		}
			
		this.getOutput("Completion", this.completionTime);
		
	}
	
	private void calcTurnAroundTime(){
		turnAroundTime = new int[noofprocess];
		
		for(i = 0 ; i < n; i++){
			turnAroundTime[i] = completionTime[i] - process[i][0];
		}
			
		this.getOutput("TurnAround", turnAroundTime);
	}
	
	private void calcWaitingTime(){
		waitingTime = new int[noofprocess];
		
		for(i = 0 ; i < n; i++){
			waitingTime[i] = turnAroundTime[i] - process[i][1];
		}
			
		this.getOutput("Waiting", waitingTime);
	}
	
	static int sum(int[] arr) 
    { 
        int sum = 0; // initialize sum 
        int i; 
        for (i = 0; i < arr.length; i++) 
           sum +=  arr[i];      
        return sum; 
    } 

	private void calcAvgWaitingTime(){
		double totalWaitingTime = 0;
		double avgWaitingTime = 0;
		
		totalWaitingTime = sum(waitingTime);
		avgWaitingTime = totalWaitingTime/noofprocess;
		System.out.println("Average Waiting Time : " +avgWaitingTime +" units");
	}


	private void calcMaxWaitingTime(){
		int maxWaitingTime = waitingTime[0];
		int index =1;
		
		for( i=1; i < noofprocess ;i++){
			if(maxWaitingTime < waitingTime[i]){
				maxWaitingTime = waitingTime[i];
				index = i+1;
			}
		}
		System.out.println("Maximum Waiting Time : " +maxWaitingTime + " and the process is : P" +index);
	}
	
	
	public static void main(String[] args) {
		JobScheduler obj = new JobScheduler();
		obj.getInput();
		obj.calcCompletionTime();
		obj.calcTurnAroundTime();
		obj.calcWaitingTime();
		obj.calcAvgWaitingTime();		
		obj.calcMaxWaitingTime();		
	}

}
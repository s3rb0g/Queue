import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class MovieTime{
	public static void main (String args[]){
		Queue Movies = new LinkedList();
		Queue Snacks = new LinkedList();
		Scanner xd = new Scanner(System.in);
		
		System.out.println("Enter 3 movies you would like to watch in cinema.\n");
	for (int loop = 1; loop <= 3; loop++){
		System.out.print("Enter movie " + loop + " of 3: ");
		String input1 = xd.nextLine();
		Movies.offer(input1);	
	}
		System.out.println("\nEnter 3 snacks you would like to eat or drink while watching these movies.\n");
	for (int loop1 = 1; loop1 <= 3; loop1++){
		System.out.print("Enter snack " + loop1 + " of 3: ");
		String input2 = xd.nextLine();
		Snacks.offer(input2);			
	}
		System.out.println(" ");	
		System.out.println("Movies to watch are: " + Movies);
		System.out.println("Snacks available are: " + Snacks);
		
	int loop2 = 1;
	while (loop2 <=3) {
		System.out.print("\nPress 'S' each time you finish a snack: ");
		char eat = xd.next().charAt(0);
		
	if (eat == 'S' || eat == 's'){
		Snacks.poll();
		System.out.println("Available Snack/s: " + Snacks);
		loop2++;
	}else{
		System.out.println("\nThe character you enter is invalid.");
	}
		
	}System.out.println("\nNo more Snacks.");

		
	}
}
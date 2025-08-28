public class TeamRanks
{
    public static void main(String[] args) 
    {
		String team1 = "Alabama";
        String team2 = "Ohio State";
        String team3 = "Florida State";
        String team4 = "USC";
        String team5 = "Clemson";
        String team6 = "Penn State";
        
		/*
		 * Don't edit above this line.
		 * Enter your code below this comment.
		 */
        // Type your variable assignment statements here:
        String temp = team2;
        team2 = team6;
        team6 = temp;
        temp = team3;
        team3 = team4; 
        team4 = temp;
        temp = team3;
        team3 = team5;
        team5 = temp;

		
		/*
		 * Don't edit below this line.
		 * Enter your code above this comment.
		 */

		System.out.print("1. ");
		System.out.println(team1);
		System.out.print("2. ");
		System.out.println(team2);
		System.out.print("3. ");
		System.out.println(team3);
		System.out.print("4. ");
		System.out.println(team4);
		System.out.print("5. ");
		System.out.println(team5);
		System.out.print("6. ");
		System.out.println(team6);
	}
}

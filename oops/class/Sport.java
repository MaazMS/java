public class Sport {

	private int player;
	private int ball;
	private float fieldLength;
	private float fieldWidth;
	private int referee;
	private long audience;
	private int scoreBoard;
	private String weather;

	public int run() {
		System.out.println("player running ");
		return 0;
	}

	public int score(int run) {
		scoreBoard = run;
		System.out.println("Total score is " + scoreBoard);
		return 0;
	}

	public int field(float length, float width) {

		fieldLength = length;
		fieldWidth = width;
		System.out.println("Cricket field Length	" + fieldLength + "m");
		System.out.println("Cricket field width	" + fieldWidth + "m");
		return 0;
	}

	public static void main(String args[]) {

		Sport cricket = new Sport();
		cricket.player = 11;
		cricket.ball = 1;
		cricket.referee = 3;
		cricket.audience = 100000;
		cricket.weather = "Summer";

		cricket.run();
		cricket.score(4);
		cricket.field(12.2f, 3.05f);

		System.out.println("number of player	" + cricket.player);
		System.out.println("number of ball 		" + cricket.ball);
		System.out.println("number of referee 	" + cricket.referee);
		System.out.println("number of audience	" + cricket.audience);
		System.out.println("Best weather of cricket	" + cricket.weather);

	}
}
/* OUTPUT
 player running 
Total score is 4
Cricket field Length	12.2m
Cricket field width	3.05m
number of player	11
number of ball 		1
number of referee 	3
number of audience	100000
Best weather of cricket	Summer
*/

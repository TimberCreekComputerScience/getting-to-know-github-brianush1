import java.util.*;
public class lemonade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much lemonade do you want? 5 cents a lemonade");
		int howmuch = scan.nextInt();
		if (howmuch < 0) {
			System.out.println("Very funny... haha...");
		}
		else if (howmuch == 0) {
			System.out.println("That's free.");
		}
		else {
			System.out.println("That'll be " + (5 * howmuch) + " cents for " + howmuch + " lemonades.");
		}
	}
}

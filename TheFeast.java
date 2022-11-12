import java.util.ArrayList;
import java.util.List;

public class HomeworkDay10 {
	public static void main(String[] args) {
	
		System.out.println(theFeast(15,3,2));
	}

	public static int theFeast(int n, int c, int m) {
		int totalBar = n / c;
		int wrapper = totalBar;
		while (wrapper >= m) {
			++totalBar;
			wrapper = wrapper - m + 1;
		}

		return totalBar;

	}
}

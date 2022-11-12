public class HomeworkDay10 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 3, 3, 6, 8, 1 };
		System.out.println(minGap(arr));
	}

	public static int minGap(int[] arr) {
		int minDistance;
		int min;
		List<Integer> gaps = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					minDistance = j - i;
					gaps.add(minDistance);
				}
			}
		}
		min = gaps.get(0);
		for (int i = 1; i < gaps.size(); i++) {
			if (gaps.get(i) < min) {
				min = gaps.get(i);
			}
		}
		return min;
	}

}
//O(n^2)

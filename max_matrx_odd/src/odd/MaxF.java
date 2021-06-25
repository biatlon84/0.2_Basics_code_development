package odd;

public class MaxF {
	public static int lookFor(int[][] ar) {
		// int volue;
		int buf = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			for (int volue : ar[i]) {
				buf = volue > buf ? volue : buf;
			}
		}
		return buf;
	}
}
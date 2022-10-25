package opgave_3_strengSøgning;

public class AppStrengSøgning {
	public static int find(String sm, int m) {
		int indeks = -1;
		int i = 0;
		while (indeks == -1 && i <= sm.length()-m) {
			if (match(sm,m,i)) {
				indeks = i;
			}
			else {
				i++;
			}
		}
		return indeks;
	}
	private static boolean match(String sm, int m, int i) {
		boolean foundDiff = false;
		int j = 0;
		while (!foundDiff && j < m-1) {
			if (sm.charAt(i+j)!= sm.charAt(i+j+1)) {
				foundDiff = true;
			}
			else {
				j++;
			}
		}
		return !foundDiff;
	}

	public static void main(String[] args) {
		System.out.println(find("Lotte og Tottte bader", 3));

	}

}

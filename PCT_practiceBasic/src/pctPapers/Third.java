package pctPapers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v, h;
		String[] line = sc.nextLine().split("\\s+");
		v = Integer.parseInt(line[0]);
		h = Integer.parseInt(line[1]);
		List<String> verticle = new ArrayList<>();
		List<String> horizonal = new ArrayList<>();
		int intersection = 0;
		int total = v + h;
		for (int k = 1; k <= total; k++) {
			if (k <= v) {
				// String newLine=sc.next();
				verticle.add(sc.nextLine());
			} else {
				// String newLine = sc.next();`
				horizonal.add(sc.nextLine());
			}
		}

		for (String stringV : verticle) {
			String[] ver = stringV.trim().split("\\s+");
			for (String stringH : horizonal) {
				String[] hori = stringH.trim().split("\\s+");
				if ((Integer.parseInt(hori[1]) >= Integer.parseInt(ver[0])
						&& (Integer.parseInt(ver[0]) >= Integer.parseInt(hori[2])))
						|| (Integer.parseInt(hori[1]) <= Integer.parseInt(ver[0])
								&& (Integer.parseInt(ver[0]) <= Integer.parseInt(hori[2])))) {
					intersection++;

				}

			}
		}
		System.out.println(intersection);

		sc.close();
	}
}

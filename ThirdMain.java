import java.util.ArrayList;
import java.util.Scanner;

class GoldSearch {
	public int goldway(int d_row, int d_col, int m_row, int m_col, int g_row, int g_col) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 0, count = -1, k, m;

		if (m_row > g_row && m_col > g_col) {
			k = m_row;
			while (k >= g_row) {
				al.add(k);
				al.add(m_col);
				k--;
				count++;
			}
			m = m_col;
			k = k + 1;
			while (m >= g_col) {
				al.add(k);
				m--;
				al.add(m);
				count++;
			}
		} else if (m_row < g_row && m_col < g_col) {
			k = m_row;
			while (k <= g_row) {
				al.add(k);
				al.add(m_col);
				k++;
				count++;
			}
			k = k - 1;
			m = m_col;
			while (m <= g_col) {
				al.add(k);
				m++;
				al.add(m);
				count++;
			}
		} else if (m_row > g_row && m_col < g_col) {
			k = m_col;
			while (k <= g_col) {
				al.add(m_row);
				al.add(k);
				k++;
				count++;
			}
			k = k - 1;
			m = m_row - 1;
			while (m >= g_row) {
				al.add(m_row - 1);
				al.add(k);
				m--;
				count++;
			}

		} else if (m_row < g_row && m_col > g_col) {
			k = m_row;
			while (k <= g_row) {
				count++;
				al.add(k);
				al.add(m_col);
				k++;
			}
			k = k - 1;
			m = m_col;
			while (m >= g_col) {
				count++;
				al.add(k);
				m--;
				al.add(m);
			}
		}
		System.out.println("\nPATH  : ");
		for (i = 0; i < al.size(); i++) {
			if (i % 2 == 0) {
				System.out.print("(");
			}
			System.out.print(al.get(i));
			if (i % 2 == 0) {
				System.out.print(",");
			}
			if (i % 2 != 0) {
				System.out.print(")");
			}
		}
		return count;
	}
}

public class ThirdMain {

	public static void main(String[] args) {
		int i, dungeon_row, dungeon_col, adv_row, adv_col, monster_row, monster_col, gold_row, gold_col;
		int man_gold, monster_gold;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the dungeon row       : ");
			dungeon_row = sc.nextInt();
			System.out.println("Enter the dungeon column    : ");
			dungeon_col = sc.nextInt();
			System.out.println("Enter the adverturer row    : ");
			adv_row = sc.nextInt();
			System.out.println("Enter the adventurer column : ");
			adv_col = sc.nextInt();
			System.out.println("Enter the monster row       : ");
			monster_row = sc.nextInt();
			System.out.println("Enter the monster column    : ");
			monster_col = sc.nextInt();
			System.out.println("Enter the gold row          : ");
			gold_row = sc.nextInt();
			System.out.println("Enter the gold column       : ");
			gold_col = sc.nextInt();
			GoldSearch gs = new GoldSearch();
			man_gold = gs.goldway(dungeon_row, dungeon_col, adv_row, adv_col, gold_row, gold_col);
			monster_gold = gs.goldway(dungeon_row, dungeon_col, monster_row, monster_col, gold_row, gold_col);
			if (man_gold > monster_gold) {
				System.out.println("\nNot Possible");
			} else {
				System.out.println("\nMinimum number of steps is : " + man_gold);
			}
			// System.out.println("\nMinimum number of steps is : "+man_gold);
			System.out.println("\nEnter 1 to continue  or  0 to discontinue....");
			i = sc.nextInt();
		} while (i != 0);
		sc.close();
	}

}
import java.util.Scanner;

class GoldSearch {
	public int goldway(int d_row, int d_col, int m_row, int m_col, int g_row, int g_col) {
		int i = 0, j = 0, count = 0;
		if (m_row >= g_row && m_col >= g_col) {
			for (i = m_row; i > g_row; i--) {
				count++;
			}
			for (j = m_col; j > g_col; j--) {
				count++;
			}
		} else if (m_row <= g_row && m_col <= g_col) {
			for (i = m_row; i < g_row; i++) {
				count++;
			}
			for (j = m_col; j < g_col; j++) {
				count++;
			}
		} else if (m_row >= g_row && m_col <= g_col) {
			for (i = m_row; i > g_row; i--) {
				count++;
			}
			for (j = m_col; j < g_col; j++) {
				count++;
			}
		} else if (m_row <= g_row && m_col >= g_col) {
			for (i = m_row; i < g_row; i++) {
				count++;
			}
			for (j = m_col; j > g_col; j--) {
				count++;
			}
		}
		return count;
	}
}

public class FourthMain {

	public static void main(String[] args) {
		int i, dungeon_row, dungeon_col, adv_row, adv_col, monster_row, monster_col, gold_row, gold_col, trig_row,
				trig_col;
		int man_gold, monster_gold, man_trig, gold_trig;
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
			System.out.println("Enter the Trigger row          : ");
			trig_row = sc.nextInt();
			System.out.println("Enter the Trigger column       : ");
			trig_col = sc.nextInt();
			GoldSearch gs = new GoldSearch();
			man_gold = gs.goldway(dungeon_row, dungeon_col, adv_row, adv_col, gold_row, gold_col);
			monster_gold = gs.goldway(dungeon_row, dungeon_col, monster_row, monster_col, gold_row, gold_col);
			man_trig = gs.goldway(dungeon_row, dungeon_col, adv_row, adv_col, trig_row, trig_col);
			gold_trig = gs.goldway(dungeon_row, dungeon_col, gold_row, gold_col, trig_row, trig_col);
			if (man_gold > monster_gold) {
				if (man_trig < man_gold) {
					System.out.println("\\nMinimum number of steps :" + man_trig + gold_trig);
				} else {
					System.out.println("\nNot Possible");
				}
			} else {
				System.out.println("\nMinimum number of steps is : " + man_gold);
			}
			System.out.println("\nEnter 1 to continue  or  0 to discontinue....");
			i = sc.nextInt();
		} while (i != 0);
		sc.close();
	}

}

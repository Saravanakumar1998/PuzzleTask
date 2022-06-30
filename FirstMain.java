package program_task_1;

import java.util.Scanner;

class GoldSearch {

	public void goldway(int d_row, int d_col, int m_row, int m_col, int g_row, int g_col) {
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
		System.out.println("\nMinimum number of steps : " + count);
	}
}

public class FirstMain {

	public static void main(String[] args) {

		int i, dungeon_row, dungeon_col, adv_row, adv_col, gold_row, gold_col;
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
			System.out.println("Enter the gold row          : ");
			gold_row = sc.nextInt();
			System.out.println("Enter the gold column       : ");
			gold_col = sc.nextInt();
			GoldSearch gs = new GoldSearch();
			gs.goldway(dungeon_row, dungeon_col, adv_row, adv_col, gold_row, gold_col);
			System.out.println("\nEnter 1 to continue  or  0 to discontinue....");
			i = sc.nextInt();
		} while (i != 0);
		sc.close();
	}
}

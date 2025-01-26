import java.util.Scanner;

public class Labirint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] labirint = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 1, 0, 1, 0, 1, 1, 1, 2},
                {2, 0, 0, 0, 0, 1, 1, 1, 2},
                {2, 0, 1, 1, 0, 0, 0, 0, 2},
                {2, 0, 1, 1, 1, 0, 1, 0, 2},
                {2, 0, 0, 1, 1, 1, 1, 0, 2},
                {2, 0, 1, 1, 0, 0, 0, 0, 2},
                {2, 1, 1, 1, 1, 1, 0, 1, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
        };
        System.out.println("Добро пожаловать в лабиринт, для победы вам нужно добраться до нижней точки за наименьшее колличество ходов.");
        System.out.println("На вашем пути будут препятсвия в виде стен, их необходимо обходить");
        System.out.println("Ваше текущее положение отмечено символом 'V'");
        System.out.println("Пройденный путь отображается сиволом 'v'");
        System.out.println("В случае хода в стену, она отображается символом 'X'");
        System.out.println("Вы начинаете с 4 элемента");
        int nachalostr = 1;
        int nachalostolb = 4;
        char[][] visual = {
                {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '-', '-', '-', 'V', '-', '-', '-', '0'},
                {'0', '-', '-', '-', '-', '-', '-', '-', '0'},
                {'0', '-', '-', '-', '-', '-', '-', '-', '0'},
                {'0', '-', '-', '-', '-', '-', '-', '-', '0'},
                {'0', '-', '-', '-', '-', '-', '-', '-', '0'},
                {'0', '-', '-', '-', '-', '-', '-', '-', '0'},
                {'0', '-', '-', '-', '-', '-', '-', '-', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
        };
        int cnt = 0;
        int stolb = nachalostolb;
        int stroka = nachalostr;
        boolean log = true;
        while (log) {
            for (int i = 0; i < visual.length; i++) {
                for (int j = 0; j < visual[0].length; j++) {
                    System.out.print(visual[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Введите путь (u - вверх, d - вниз, l - влево, r - вправо):");
            char putb = sc.next().charAt(0);

            if (putb == 'u') {
                if (labirint[stroka - 1][stolb] == 0) {
                    visual[stroka - 1][stolb] = 'V';
                    visual[stroka][stolb] = 'v';
                    stroka--;
                    cnt++;
                } else {
                    visual[stroka - 1][stolb] = 'X';
                    cnt++;
                }
            } else if (putb == 'd') {
                if (labirint[stroka + 1][stolb] == 0) {
                    visual[stroka + 1][stolb] = 'V';
                    visual[stroka][stolb] = 'v';
                    stroka++;
                    cnt++;
                } else {
                    visual[stroka + 1][stolb] = 'X';
                    cnt++;
                }
            } else if (putb == 'l') {
                if (labirint[stroka][stolb - 1] == 0) {
                    visual[stroka][stolb - 1] = 'V';
                    visual[stroka][stolb] = 'v';
                    stolb--;
                    cnt++;
                } else {
                    visual[stroka][stolb - 1] = 'X';
                    cnt++;
                }
            } else if (putb == 'r') {
                if (labirint[stroka][stolb + 1] == 0) {
                    visual[stroka][stolb + 1] = 'V';
                    visual[stroka][stolb] = 'v';
                    stolb++;
                    cnt++;
                } else {
                    visual[stroka][stolb + 1] = 'X';
                    cnt++;
                }
            } else {
                System.out.println("Неверный ввод. Попробуйте снова.");
            }
            if (visual[7][6] == 'V') {
                for (int i = 0; i < visual.length; i++) {
                    for (int j = 0; j < visual[0].length; j++) {
                        System.out.print(visual[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Поздравляю! Вы прошли лабиринт за " + cnt + " шагов");
                log = false;
            }

        }
    }
}

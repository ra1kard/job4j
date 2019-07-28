package ru.job4j.loop;

/**
 * Board - класс для построения шахматной доски в псевдографике.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 28.07.2019
 */
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        final String ln = System.getProperty("line.separator");
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if ((i+j)%2==0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
/*    public static void main(String[] args) {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        System.out.println(rsl);

        Board board1 = new Board();
        String rsl1 = board1.paint(5, 4);
        System.out.println(rsl1);
    }*/
}

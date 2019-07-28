package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BoardTest - тест для построения шахматной доски в псевдографике.
 *
 * @author Stanislav Kufarev (91raykard@gmail.com)
 * @version 1
 * @since 28.07.2019
 */
public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        final String ln = System.getProperty("line.separator");
        String expected = String.format("X X%s X %sX X%s", ln, ln, ln);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when5x4() {
        Board board = new Board();
        String rsl = board.paint(5,4);
        final String ln = System.getProperty("line.separator");
        String expected = String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln);
        assertThat(rsl, is(expected));
    }
}

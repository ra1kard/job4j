package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindNo() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 1;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 4, 1, 5, 2};
        int result[] = find.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 2, 9, 1};
        int result[] = find.sort(input);
        int[] expect = new int[] {1, 2, 3, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {7, 2, 5};
        int result[] = find.sort(input);
        int[] expect = new int[] {2, 5, 7};
        assertThat(result, is(expect));
    }
}

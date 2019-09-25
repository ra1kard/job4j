package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray2(){
        Turn turner = new Turn();
        int[] input = new int[] {3, 5, 6, 1, 8, 9, 3, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 3, 9, 8, 1, 6, 5, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray3(){
        Turn turner = new Turn();
        int[] input = new int[] {7, 3};
        int[] result = turner.back(input);
        int[] expect = new int[] {3, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray2() {
        Turn turner = new Turn();
        int[] input = new int[] {7, 3, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 3, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTaskTanya() {
        Turn turner = new Turn();
        String[] input = new String[] {"h", "e", "l", "l", "o"};
        String[] result = turner.back(input);
        String[] expect = new String[] {"o","l","l","e","h"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTaskTanya2() {
        Turn turner = new Turn();
        String[] input = new String[] {"H", "a", "n", "n", "a", "h", "1", "2", "3", "4", "5", "6", "7", "8"};
        String[] result = turner.back(input);
        String[] expect = new String[] {"8", "7", "6", "5", "4", "3", "2", "1", "h", "a", "n", "n", "a", "H"};
        assertThat(result, is(expect));
    }
}

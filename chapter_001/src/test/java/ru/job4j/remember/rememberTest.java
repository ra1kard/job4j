package ru.job4j.remember;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class rememberTest {
    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Zlatan Ibrahimovich";
        String expect = "Echo, echo, echo, echo : Zlatan Ibrahimovich";
        Remember remb = new Remember();
        String result = remb.echo(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenTakeNameThenThreeEchoPlusName2() {
        String input = "Zlatan Ibrahimovich";
        String expect = "Echo, echo, echo, echo : " + input;
        Remember remb = new Remember();
        String result = remb.echo(input);
        assertThat(result, is(expect));
    }
}
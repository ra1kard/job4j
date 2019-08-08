package com.oreilly.сhapter1;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DoBeeTest {

    @Test
    public void whenSkoobyTalk() {
        DoBee dobee = new DoBee();
        String result = dobee.echo("Doo", "Bee", "Do");
        assertThat(result, is("DooBeeDooBeeDo"));
    }
}

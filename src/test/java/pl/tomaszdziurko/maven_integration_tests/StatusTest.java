package pl.tomaszdziurko.maven_integration_tests;

import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class StatusTest {

    @Test
    public void shouldFail() {
        assertThat("aaa").isEqualTo("");
    }
}

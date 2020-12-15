package com.2018ht66507;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2018ht66508 {

    @Test
    public void testNameBITS() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("BITS WILP", obj.getMessage("WILP"));

    }

}

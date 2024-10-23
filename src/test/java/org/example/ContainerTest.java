package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.awt.*;

public class ContainerTest{
    @Test
    void container_empty_if_not_data_added() {
        Container container = new Container();
        assertTrue(container.isEmpty());
    }
}
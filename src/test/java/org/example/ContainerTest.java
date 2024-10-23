package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.awt.*;
import java.lang.IndexOutOfBoundsException;

public class ContainerTest{
    @Test
    void container_empty_if_not_data_added() {
        Container container = new Container();
        assertTrue(container.isEmpty());
    }
    @Test
    void container_not_empty_if_data_added_using_constructor() {
        Container container = new Container(1, 2, 3);
        assertFalse(container.isEmpty());
    }

    @Test
    void container_not_empty_if_data_added_using_add_method() {
        Container container = new Container(1);
        assertFalse(container.isEmpty());
    }

    @Test
    void remove_method_returns_false_if_not_delete_value() {
        Container container = new Container(3);
        assertFalse(container.remove(4));
    }

    @Test
    void remove_method_returns_false_if_container_is_empty() {
        Container container = new Container();
        assertFalse(container.remove(5));
    }

    @Test
    void remove_method_returns_true_if_value_deleted() {
        Container container = new Container(7);
        assertTrue(container.remove(7));
    }

    @Test
    void get_method_returns_null_if_value_is_not_found() {
        Container container = new Container(6, 7, 8, 9);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            container.get(12);
        });
    }
}
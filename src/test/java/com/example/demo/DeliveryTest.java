package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.demo.flowers.delivery.DHLDeliveryStrategy;
import com.example.demo.flowers.delivery.PostDeliveryStrategy;
import com.example.demo.flowers.flower.Item;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

public class DeliveryTest {

    @Test
    public void testDelivery1() {
        DHLDeliveryStrategy dhlDelivery = new DHLDeliveryStrategy();
        LinkedList<Item> items = new LinkedList<>();
        String result = dhlDelivery.delivery(items);
        assertEquals("Your order is delivered by DHL", result);
    }

    @Test
    public void testDelivery2() {
        PostDeliveryStrategy postDelivery = new PostDeliveryStrategy();
        LinkedList<Item> items = new LinkedList<>();
        String result = postDelivery.delivery(items);
        assertEquals("Your package is delivered by Post", result);
    }

}
package com.util;

import com.model.Waiter;

import java.util.ArrayList;
import java.util.List;

public class WaiterGenerator {

    public static List<Waiter> generateWaiters(int nrOfWaiters) {
        List<Waiter> waiters = new ArrayList<>();

        for (int i = 0; i < nrOfWaiters; i++) {
            waiters.add(new Waiter());
        }

        return waiters;
    }
}

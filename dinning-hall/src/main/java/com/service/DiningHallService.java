package com.service;

import com.model.Food;
import com.model.Waiter;
import com.util.Menu;
import com.model.Table;
import com.util.WaiterGenerator;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class DiningHallService {

    private static DiningHallService singleInstance;
    @Getter private final List<Food> menu = Menu.fillMenu();
    private List<Table> tables = new ArrayList<>();
    @Getter @Setter private List<Waiter> waiters = WaiterGenerator.generateWaiters(5);

    private DiningHallService() {}

    public static DiningHallService getInstance()
    {
        if (singleInstance == null)
            singleInstance = new DiningHallService();

        return singleInstance;
    }

    public void openDiningHall() {
        for (Waiter waiter : waiters) {
            Thread thread = new Thread(waiter);
            thread.start();
        }
    }
}

package com.utm.kitchen.util;

import com.utm.kitchen.model.Cook;

import java.util.ArrayList;
import java.util.List;

public class CookGenerator {

    public static List<Cook> generateCooks() {

        List<Cook> cooks = new ArrayList<>();

        cooks.add(new Cook(1,
                1,
                "Igor Ovadenco",
                "I.O.",
                false)
        );
        cooks.add(new Cook(2,
                2,
                "Ovadenco Igor",
                "O.I.",
                false)
        );
        cooks.add(new Cook(3,
                3,
                "Igor Andrei",
                "I.A.",
                false)
        );
        cooks.add(new Cook(3,
                4,
                "Andrei Igor",
                "A.I.",
                false)
        );

        return cooks;
    }
}

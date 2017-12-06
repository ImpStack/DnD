package org.impstack.dnd.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author remy
 * @since 6/12/17.
 */
public class ProficiencyBonus {

    private static Map<Integer, Integer> modifiers = new HashMap<>();

    static {
        modifiers.put(1, 2);
        modifiers.put(2, 2);
        modifiers.put(3, 2);
        modifiers.put(4, 2);
        modifiers.put(5, 3);
        modifiers.put(6, 3);
        modifiers.put(7, 3);
        modifiers.put(8, 3);
        modifiers.put(9, 4);
        modifiers.put(10, 4);
        modifiers.put(11, 4);
        modifiers.put(12, 4);
        modifiers.put(13, 5);
        modifiers.put(14, 5);
        modifiers.put(15, 5);
        modifiers.put(16, 5);
        modifiers.put(17, 6);
        modifiers.put(18, 6);
        modifiers.put(19, 6);
        modifiers.put(20, 6);
    }

    private ProficiencyBonus() {
    }

    public static void setModifiers(Map<Integer, Integer> modifiers) {
        ProficiencyBonus.modifiers = modifiers;
    }

    public static int getModifier(int level) {
        return modifiers.get(level);
    }

}

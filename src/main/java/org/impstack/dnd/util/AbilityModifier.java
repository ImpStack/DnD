package org.impstack.dnd.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author remy
 * @since 30/11/17
 */
public class AbilityModifier {

    private static Map<Integer, Integer> modifiers = new HashMap<>();

    static {
        modifiers.put(1, -5);
        modifiers.put(2, -4);
        modifiers.put(3, -4);
        modifiers.put(4, -3);
        modifiers.put(5, -3);
        modifiers.put(6, -2);
        modifiers.put(7, -2);
        modifiers.put(8, -1);
        modifiers.put(9, -1);
        modifiers.put(10, 0);
        modifiers.put(11, 0);
        modifiers.put(12, 1);
        modifiers.put(13, 1);
        modifiers.put(14, 2);
        modifiers.put(15, 2);
        modifiers.put(16, 3);
        modifiers.put(17, 3);
        modifiers.put(18, 4);
        modifiers.put(19, 4);
        modifiers.put(20, 5);
        modifiers.put(21, 5);
        modifiers.put(22, 6);
        modifiers.put(23, 6);
        modifiers.put(24, 7);
        modifiers.put(25, 7);
        modifiers.put(26, 8);
        modifiers.put(27, 8);
        modifiers.put(28, 9);
        modifiers.put(29, 9);
        modifiers.put(30, 10);
    }

    private AbilityModifier() {
    }

    public void setModifiers(Map<Integer, Integer> modifiers) {
        AbilityModifier.modifiers = modifiers;
    }

    public static int getModifier(int score) {
        return modifiers.get(score);
    }

}

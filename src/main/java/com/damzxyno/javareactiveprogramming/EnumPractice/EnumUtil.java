package com.damzxyno.javareactiveprogramming.EnumPractice;

public final class EnumUtil {
    public static <E extends Enum<E>> E validateEnum(Class<E> clazz, String s) {
        for (var c : clazz.getEnumConstants()) {
            String each = c.name().replaceAll("_", " ");
            if(each.equalsIgnoreCase(s)) return c;
        }
        return null;
    }

    public static <E extends Enum<E>> E chocoMilo(Class<E> clazz, String s) {
        try {
            return Enum.valueOf(clazz, s.replaceAll(" ", "_").toUpperCase());
        } catch (Exception e){
            return null;
        }
    }
}

package com.interview;

import java.lang.reflect.Field;

// 不修改原地址的情况下 改变 字符串
// reflect
public class ReflectChangeString {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");

        System.out.print(s + "\t\t");
        System.out.println(s.hashCode());

        final Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s, "abcd".toCharArray());

        System.out.print(s + "\t");
        System.out.println(s.hashCode());
    }
}

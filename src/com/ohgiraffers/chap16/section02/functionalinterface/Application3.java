package com.ohgiraffers.chap16.section02.functionalinterface;

import java.util.function.*;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Function에 대해 이해하고 사용할 수 있다. */
        /* Function : 매개변수와 리턴값이 있는 applyXXX() 메서드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할) */
        /* 1. Function<T, R>#apply(T t) : R : 객체 T를 R로 매핑한다. */
        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());

        /* 2. BiFunction<T, U, R>#apply(T t, U u) : R : 객체 T와 U를 R로 매핑한다. */
        BiFunction<String, String, Integer> bifunction = (str, str2) -> Integer.parseInt(str) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "67890";
        System.out.println(bifunction.apply(str1, str2) + " : " +  bifunction.apply(str1, str2).getClass().getName());

        /* 3. IntFunction<R>#apply(int value) : R : int를 R로 매핑한다. */
        IntFunction<String> intFunction = intValue -> String.valueOf(intValue);
        int intValue1 = 123;
        System.out.println(intFunction.apply(intValue1) + " : " + intFunction.apply(intValue1).getClass().getName());

        /* 4. IntToDoubleFunction#applyAsDouble(int value) : double : int를 double로 매핑한다. */
        IntToDoubleFunction intToDoubleFunction = intValue2 -> Double.parseDouble(String.valueOf(intValue2));
        int intValue2 = 1234;
        System.out.println(intToDoubleFunction.applyAsDouble(intValue2) + " : " + ((Object)intToDoubleFunction.applyAsDouble(intValue2)).getClass().getName());

        /* 5. IntToLongFunction#applyAsLong(int value) : long : int를 long으로 매핑한다. */
        IntToLongFunction intToLongFunction = intValue3 -> Long.parseLong(String.valueOf(intValue3));
        int intValue3 = 12345;
        System.out.println(intToLongFunction.applyAsLong(intValue3) + " : " + ((Object)intToLongFunction.applyAsLong(intValue3)).getClass().getName());

        /* 6. DoubleFunction<R>#apply(double value) : R : double을 R로 매핑한다. */
        DoubleFunction<String>  doubleFunction = str -> String.valueOf(str);
        int intValue4 = 456;
        System.out.println(doubleFunction.apply(intValue4) + " : " + ((Object)doubleFunction.apply(intValue4)).getClass().getName());

        /* 7. LongToDoubleFunction#applyAsDouble(long value) : double : long을 double로 매핑한다. */
        LongToDoubleFunction longToDoubleFunction = longValue -> Double.parseDouble(String.valueOf(longValue));
        long longValue = 12345;
        System.out.println(longToDoubleFunction.applyAsDouble(longValue) + " : " + ((Object)longToDoubleFunction.applyAsDouble(longValue)).getClass().getName());

        /* 8. LongToIntFunction#applyAsInt(long value) : int : long을 int로 매핑한다. */
        LongToIntFunction longToIntFunction = longValue2 -> Integer.parseInt(String.valueOf(longValue2));
        long longValue2 = 678L;
        System.out.println(longToIntFunction.applyAsInt(longValue2) + " : " + ((Object)longToIntFunction.applyAsInt(longValue2)).getClass().getName());

        /* 9. ToDoubleBiFunction<T, U>#applyAsDouble(T t, U u) : double : 객체 T와 U를 double로 매핑한다. */
        ToDoubleBiFunction<Integer, Long> toDoubleBiFunction = (intValue5, longValue3) -> intValue5.doubleValue() / longValue3.doubleValue();
        int intValue5 = 98765;
        long longValue4 = 43210L;
        System.out.println(toDoubleBiFunction.applyAsDouble(intValue4, longValue4) + " : " + ((Object)toDoubleBiFunction.applyAsDouble(intValue4, longValue4)).getClass().getName());

        /* 10. ToDoubleFunction<T>#applyAsDouble(T t) : double : 객체 T를 double로 매핑한다. */
        ToDoubleFunction<String> toDoubleFunction = (strValue2) -> Double.parseDouble(strValue2);
        String strValue2 = "13579";
        System.out.println(toDoubleFunction.applyAsDouble(strValue2) +  " : " + ((Object)toDoubleFunction.applyAsDouble(strValue2)).getClass().getName());

        /* 11. ToIntBiFunction<T, U>#applyAsInt(T t, U u) : int : 객체 T와 U를 int로 매핑한다. */
        ToIntBiFunction<String, Float> toIntBiFunction = (strValue3, floatValue) -> Integer.parseInt(strValue3.toString()) * floatValue.intValue();
        String strValue3 = "100";
        Float floatValue1 = 45.6f;
        System.out.println(toIntBiFunction.applyAsInt(strValue3, floatValue1) + " : " + ((Object)toIntBiFunction.applyAsInt(strValue3, floatValue1)).getClass().getName());

        /* 12. ToIntFunction<T>#applyAsInt(T t) : int : 객체 T를 int로 매핑한다. */
        ToIntFunction<Float> toIntFunction = floatValue -> floatValue.intValue();
        Float floatValue2 = 45.6f;
        System.out.println(toIntFunction.applyAsInt(floatValue2) + " : " + ((Object)toIntFunction.applyAsInt(floatValue2)).getClass().getName());

        /* 13. ToLongBiFunction<T, U>#applyAsLong(T t, U u) : long : 객체 T와 U를 long으로 매핑한다. */
        ToLongBiFunction<Integer, Double> toLongBiFunction = (intValue, doubleValue) -> Long.parseLong(String.valueOf(intValue)) * doubleValue.longValue();
        int intValue6 = 12345;
        Double doubleValue1 = 678.9;
        System.out.println(toLongBiFunction.applyAsLong(intValue6, doubleValue1) + " :  " + ((Object)toLongBiFunction.applyAsLong(intValue6, doubleValue1)).getClass().getName());

        /* 14. ToLongFunction<T>#applyAsLong(T t) : long : 객체 T를 long으로 매핑한다.  */
        ToLongFunction<String> toLongFunction = (stringValue) -> Long.parseLong(stringValue);
        String strValue1 = "12345";
        System.out.println(toLongFunction.applyAsLong(strValue1) + " : " + ((Object)toLongFunction.applyAsLong(strValue1)).getClass().getName());
    }
}

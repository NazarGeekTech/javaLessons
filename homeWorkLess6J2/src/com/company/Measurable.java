package com.company;

public interface Measurable<T extends Number,S extends Number> {
    void billMaker(T t,S s);
    void calculatorDues(T t,S s);
}

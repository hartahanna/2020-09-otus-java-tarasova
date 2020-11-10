package ru.otus;

import com.google.common.base.Optional;

public class HelloOtus {
    //private static final Logger LOG = Logger.getLogger(App.class);

    public static void main(String[] args) {
        Integer value = null;
        Optional<Integer> integerOptional = Optional.fromNullable(value);
        System.out.println("Value is present: "+integerOptional.isPresent());

    }
}
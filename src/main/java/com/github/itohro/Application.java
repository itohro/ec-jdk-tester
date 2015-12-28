package com.github.itohro;

import org.eclipse.collections.api.block.procedure.Procedure;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;

public class Application {
    public static void main(String[] args) {
        MutableList<String> list = Lists.mutable.of("Eclipse ", "Collections ", "code ", "is ", "successfully ", "executed.");
        list.forEach(new Procedure<String>() {
            public void value(String each) {
                System.out.print(each);
            }
        });
    }
}

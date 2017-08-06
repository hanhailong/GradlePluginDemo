package com.hhl.sample

import com.hhl.sample.ext.DemoExtension


class Main {
//    demoExtension.setName ( "xxxx" );

    public static void main(String[] args) {
        DemoExtension demoExtension = new DemoExtension()

        demoExtension.name = "abc"

        demoExtension.version = 1000

        println(demoExtension.name)
        println(demoExtension.version)
    }
}

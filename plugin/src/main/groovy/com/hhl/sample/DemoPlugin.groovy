package com.hhl.sample

import com.hhl.sample.ext.DemoExtension
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class DemoPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {

        //创建配置参数
        target.extensions.create("demoPluginExt", DemoExtension)

        target.task("demoTask").doLast {
            println("Hello World")

            //打印创建的ext中name为demoPluginExt的name属性值
            println(target.demoPluginExt.name)
        }

        target.getTasks().create("demoTask2", DefaultTask)

    }

}

package ru.veryevilzed.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.veryevilzed.tools.ScenarioService;

/**
 * Created by zed on 11.08.16.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"ru.veryevilzed"})
public class Application implements CommandLineRunner {

    @Autowired
    ScenarioService scenarioService;


    @Autowired
    ScenarioA scenarioA;


    @Override
    public void run(String... args) throws Exception {
        MyContext context = new MyContext();
        context.index = 30;
        scenarioA.scenarioPath1(context);

        context = (MyContext)scenarioService.execute("main", "main2", context);
        System.out.println("RES CONTEXT:" + context.index);
        Integer i = 5; //NOT WORKED WITH final
        i = (Integer)scenarioService.execute("main2", "main", i);
        System.out.println("I CONTEXT:" + i);
    }


    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}

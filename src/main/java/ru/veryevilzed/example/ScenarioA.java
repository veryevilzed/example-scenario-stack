package ru.veryevilzed.example;

import ru.veryevilzed.tools.Scenario;
import ru.veryevilzed.tools.ScenarioMethod;
import ru.veryevilzed.tools.ScenarioTarget;

/**
 * Created by zed on 11.08.16.
 */
@Scenario(name = "main", context="ru.veryevilzed.example.MyContext")
public interface ScenarioA {


    @ScenarioMethod(
            name = "main",
            targets = {
                    @ScenarioTarget(autowired = "ru.veryevilzed.example.TestService", method = "Test", params = {"15", "new int[] {1,2}"}),
                    @ScenarioTarget(method = "ru.veryevilzed.example.Tools.calculate")
            })
    Object scenarioPath1(MyContext context);


    @ScenarioMethod(
            name = "main2",
            targets = {
                    @ScenarioTarget(autowired = "ru.veryevilzed.example.TestService", method = "Test", params = {"100", "new int[] {1,2}"}),
                    @ScenarioTarget(method = "ru.veryevilzed.example.Tools.calculate")
            })
    Object scenarioPath2(MyContext context);

}

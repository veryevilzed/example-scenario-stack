package ru.veryevilzed.example;

import ru.veryevilzed.tools.Scenario;
import ru.veryevilzed.tools.ScenarioMethod;
import ru.veryevilzed.tools.ScenarioTarget;

/**
 * Created by zed on 11.08.16.
 */
@Scenario(name = "main", context="java.lang.Object")
public interface ScenarioA {


    @ScenarioMethod(
            name = "main",
            targets = {
                @ScenarioTarget(method = "ru.veryevilzed.example.Tools.calcilate"),
                @ScenarioTarget(autowired = "ru.veryevilzed.example.TestService", method = "Test", params = {"15"})
            })
    Object scenarioPath1(Object context);

}

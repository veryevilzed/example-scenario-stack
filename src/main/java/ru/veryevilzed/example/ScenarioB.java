package ru.veryevilzed.example;

import ru.veryevilzed.tools.Scenario;
import ru.veryevilzed.tools.ScenarioMethod;
import ru.veryevilzed.tools.ScenarioTarget;

/**
 * Created by zed on 11.08.16.
 */
@Scenario(name = "main2", context="java.lang.Integer")
public interface ScenarioB {

    @ScenarioMethod(
            name = "main",
            targets = {
                    @ScenarioTarget(autowired = "ru.veryevilzed.example.TestService", method = "Test2", params = {"15"}),
                    @ScenarioTarget(method = "ru.veryevilzed.example.Tools.calculateObject")
            })
    Integer process(Integer val);

}

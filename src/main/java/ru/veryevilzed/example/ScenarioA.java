package ru.veryevilzed.example;

import ru.veryevilzed.tools.Scenario;
import ru.veryevilzed.tools.ScenarioMethod;
import ru.veryevilzed.tools.ScenarioTarget;

/**
 * Created by zed on 11.08.16.
 */
@Scenario(name = "main", incoming="")
public interface ScenarioA {


    @ScenarioMethod(targets = {
            @ScenarioTarget(name = "ru.veryevilzed.example.Tools.calculate"),
            @ScenarioTarget(name = "ru.veryevilzed.example.Tools.calculate"),
            @ScenarioTarget(name = "ru.veryevilzed.example.Tools.calculate"),
            @ScenarioTarget(name = "ru.veryevilzed.example.Tools.calculate"),
    })
    void scenarioPath1();

}

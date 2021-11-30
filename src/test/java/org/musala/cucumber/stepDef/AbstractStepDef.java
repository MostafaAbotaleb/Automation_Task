package org.musala.cucumber.stepDef;

import org.apache.log4j.Logger;
import org.musala.cucumber.runner.TestState;

public class AbstractStepDef {
    protected static Logger logger;
    protected final TestState state;

    public AbstractStepDef(TestState state, String className) {
        logger = Logger.getLogger(className);
        logger.trace(className);
        this.state = state;
    }
}

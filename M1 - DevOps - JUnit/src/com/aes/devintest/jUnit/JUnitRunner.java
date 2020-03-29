package com.aes.devintest.jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                junitDemo.class,
                AppUtilTest.class,
                JUnitFunctionalTests.class,
        }
)
public class JUnitRunner {
    // creates the suite  of test classes.
}

package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;



@Suite
@SelectClasses({VoitureTest.class, EchantillonTest.class})
public class SuiteDeTest {

}

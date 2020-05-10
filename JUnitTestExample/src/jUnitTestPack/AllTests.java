package jUnitTestPack;

//import org.junit.jupiter.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//import testAddNumbers;
//import testAddStrings.class;



@RunWith(Suite.class)
@SuiteClasses({testAddStrings.class,testAddNumbers.class})
public class AllTests {

}

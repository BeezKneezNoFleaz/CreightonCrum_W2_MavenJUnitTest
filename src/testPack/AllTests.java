package testPack;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Fixtures.class, FixturesTestOne.class, FixturesTestTwo.class })
public class AllTests {

}

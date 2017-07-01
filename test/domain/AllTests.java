package domain;

import domain.model.Shapes.Omhullende;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Omhullende.class, PuntTest.class, SpelerTest.class,DriehoekTest.class, RechthoekTest.class, LijnStukTest.class })
public class AllTests {

}

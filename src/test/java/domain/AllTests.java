package domain;

import domain.model.HintLetter;
import domain.model.HintWoord;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({OmhullendeTest.class, PuntTest.class, SpelerTest.class,DriehoekTest.class, RechthoekTest.class, LijnStukTest.class, CirkelTest.class,TekeningTest.class, HintLetterTest.class, HintWoordTest.class})
public class AllTests {

}

package es.upm.miw.iwvg.klondike;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CardListTest.class, CardTest.class, CardValueTest.class, DeckTest.class, DiscardTest.class, FoundationTest.class,
        PileTest.class, SuitTest.class})
public class AllTests {

}

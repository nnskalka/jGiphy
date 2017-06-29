package org.skalka.jgiphy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.skalka.jgiphy.internal.data.GifEntryTests;
import org.skalka.jgiphy.internal.responses.MultipleEntryGiphyResponseTest;
import org.skalka.jgiphy.internal.responses.RandomGiphyResponseTest;
import org.skalka.jgiphy.internal.responses.SingleEntryGiphyResponseTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   JGiphyAPITests.class,
   
   GifEntryTests.class,
   
   MultipleEntryGiphyResponseTest.class,
   RandomGiphyResponseTest.class,
   SingleEntryGiphyResponseTest.class
})
public class JGiphySuiteTest {

}

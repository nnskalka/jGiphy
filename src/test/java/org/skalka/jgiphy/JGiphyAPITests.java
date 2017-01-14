package org.skalka.jgiphy;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class JGiphyAPITests {
	@Test
	public void JGiphyPrivateConstructor_AttemptedInitialization_ConstructorExeptionThrown() {
		try {
			Constructor<JGiphy> con = JGiphy.class.getDeclaredConstructor();
			con.setAccessible(true);
			con.newInstance();
			assertTrue(false);
		} catch (InvocationTargetException ITE) {
			// Constructor correctly fails because it throws UnsupportedOperationException
		} catch (Exception E) {
			assertTrue(false);
		}
	}
}

package de.devboost.natspec.examples.airline.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.devboost.natspec.examples.airline.InMemoryPersistenceContext;
import de.devboost.natspec.examples.airline.services.AirlineServices;

public class _NatSpecTemplate {

	private AirlineServices services;
	private TestSupport testSupport;
	private InMemoryPersistenceContext persistenceContext;

	@Test
	public void executeScript() throws Exception {
		/* @MethodBody */
	}

	@Before
	public void setUp() {
		services = new AirlineServices();
		persistenceContext = InMemoryPersistenceContext.getPersistenceContext();
		testSupport = new TestSupport(services, persistenceContext);
	}

	@After
	public void shutdown() {
		if (testSupport != null)
			testSupport = null;
		if (persistenceContext != null)
			persistenceContext.shutdown();
	}
}

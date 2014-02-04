package com.nat_spec.examples.airline.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nat_spec.examples.airline.persistence.InMemoryPersistenceContext;
import com.nat_spec.examples.airline.services.AirlineServices;
import com.nat_spec.examples.airline.test.TestSupport;

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

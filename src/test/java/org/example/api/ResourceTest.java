package org.example.api;

import org.example.App;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

import static org.junit.Assert.*;

public class ResourceTest extends JerseyTest {
	public ResourceTest() {
		super(new App());
	}

	@Test
	public void normal() {
		String response = target("api/normal")
				.queryParam("page", "1")
				.queryParam("size", "10")
				.queryParam("sort", "name")
				.queryParam("desc", "false")
				.request(MediaType.TEXT_PLAIN).get(String.class);
		assertEquals("page=1, size = 10, sort = name, desc = false", response);
	}

	@Test
	public void nested() {
		String response = target("api/nested")
				.queryParam("page", "1")
				.queryParam("size", "10")
				.queryParam("sort", "name")
				.queryParam("desc", "false")
				.request(MediaType.TEXT_PLAIN).get(String.class);
		assertEquals("page=1, size = 10, sort = name, desc = false", response);
	}
}
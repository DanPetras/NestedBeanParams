package org.example.api;

import io.swagger.v3.oas.annotations.Parameter;

import javax.ws.rs.QueryParam;

public class SortingParams {
	@Parameter(description = "requested sorting field")
	@QueryParam("sort") public String sort;

	@Parameter(description = "requested sorting direction")
	@QueryParam("desc") public boolean desc;
}

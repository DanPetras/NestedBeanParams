package org.example.api;

import io.swagger.v3.oas.annotations.Parameter;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

public class PagingParams {
	@Parameter(description = "requested page")
	@QueryParam("page") @DefaultValue("-1") public int page;

	@Parameter(description = "requested page size")
	@QueryParam("size") public int size;
}

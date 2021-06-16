package org.example.api;

import io.swagger.v3.oas.annotations.Operation;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api")
@Produces(MediaType.TEXT_PLAIN)
public class Resource {
	@GET
	@Path("normal")
	@Operation(summary = "Single level BeanParams")
	public String normal(@BeanParam PagingParams paging, @BeanParam SortingParams sorting) {
		return makeResponse(paging, sorting);
	}

	@GET
	@Path("nested")
	@Operation(summary = "Nested BeanParams")
	public String nested(@BeanParam NestedParams params) {
		return makeResponse(params.paging, params.sorting);
	}

	private String makeResponse(PagingParams paging, SortingParams sorting) {
		return "page=" + paging.page + ", size = " + paging.size +
				", sort = " + sorting.sort + ", desc = " + sorting.desc;
	}
}

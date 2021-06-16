package org.example.api;

import javax.ws.rs.BeanParam;

public class NestedParams {
	@BeanParam PagingParams paging;
	@BeanParam SortingParams sorting;
}

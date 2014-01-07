package org.sevenup.core.domain.category;

import java.util.Vector;

import org.sevenup.core.domain.common.Category;

/**
 * Category based on type
 * @author steven.xu
 *
 */
public class FabricsCategory extends Category{
	private Vector<CustomerCategory> customerCategoryList;

	public Vector<CustomerCategory> getCustomerCategoryList() {
		return customerCategoryList;
	}

	public void setCustomerCategoryList(Vector<CustomerCategory> customerCategoryList) {
		this.customerCategoryList = customerCategoryList;
	}
}

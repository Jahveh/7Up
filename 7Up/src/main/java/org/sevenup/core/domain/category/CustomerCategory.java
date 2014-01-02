package org.sevenup.core.domain.category;

import java.util.Vector;

/**
 * Category based on customers
 * @author steven.xu
 *
 */
public class CustomerCategory extends Category{
	
	private Vector<FabricsCategory> fabricsCategoryList;

	public Vector<FabricsCategory> getFabricsCategoryList() {
		return fabricsCategoryList;
	}

	public void setFabricsCategoryList(Vector<FabricsCategory> fabricsCategoryList) {
		this.fabricsCategoryList = fabricsCategoryList;
	}
}

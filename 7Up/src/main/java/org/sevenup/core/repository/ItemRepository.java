package org.sevenup.core.repository;

import java.util.List;
import java.util.UUID;

import org.sevenup.core.domain.item.Item;
/**
 * 
 * @author steven
 *
 */
public interface ItemRepository {
	Item save(Item item);

	void delete(UUID key);

	Item findById(UUID key);

	List<Item> findAll();
}

package org.sevenup.core.events.store;

import java.util.UUID;

import org.sevenup.core.domain.common.Store;
import org.sevenup.core.events.DeletedEvent;


public class StoreDeletedEvent extends DeletedEvent {
	private UUID key;
	private Store store;
	private boolean deletionCompleted;

	public StoreDeletedEvent(UUID key) {
		super();
		this.setKey(key);
	}

	public StoreDeletedEvent(UUID key, Store store) {
		super();
		this.setKey(key);
		this.setStore(store);
	}

	public static StoreDeletedEvent deletionForbidden(UUID key, Store store) {
		StoreDeletedEvent event = new StoreDeletedEvent(key, store);
		event.entityFound = true;
		event.setDeletionCompleted(false);
		return event;
	}

	public static StoreDeletedEvent notFound(UUID key) {
		StoreDeletedEvent event = new StoreDeletedEvent(key);
		event.entityFound = false;
		return event;
	}

	public UUID getKey() {
		return key;
	}

	public void setKey(UUID key) {
		this.key = key;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public boolean isDeletionCompleted() {
		return deletionCompleted;
	}

	public void setDeletionCompleted(boolean deletionCompleted) {
		this.deletionCompleted = deletionCompleted;
	}
}

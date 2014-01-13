package org.sevenup.core.events.store;

import java.util.UUID;

import org.sevenup.core.events.DeleteEvent;

public class DeleteStoreEvent extends DeleteEvent{
	private final UUID key;

	public DeleteStoreEvent(UUID key) {
		super();
		this.key = key;
	}

	public UUID getKey() {
		return key;
	}
}

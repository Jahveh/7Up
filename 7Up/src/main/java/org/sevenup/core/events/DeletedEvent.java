package org.sevenup.core.events;

public abstract class DeletedEvent {
	protected boolean entityFound = true;
	protected boolean deletionCompleted;

	public static DeletedEvent deletionForbidden() {
		return null;
	}

	public static DeletedEvent notFound() {
		return null;

	}

	public boolean isEntityFound() {
		return entityFound;
	}

	public boolean isDeletionCompleted() {
		return deletionCompleted;
	}

	public void setDeletionCompleted(boolean deletionCompleted) {
		this.deletionCompleted = deletionCompleted;
	}

	public void setEntityFound(boolean entityFound) {
		this.entityFound = entityFound;
	}
}

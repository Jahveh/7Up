package org.sevenup.core.events;

public class DeletedEvent {
  protected boolean entityFound = true;

  public boolean isEntityFound() {
    return entityFound;
  }
}

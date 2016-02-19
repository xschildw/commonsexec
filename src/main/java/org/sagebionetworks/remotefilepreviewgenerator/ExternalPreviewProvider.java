package org.sagebionetworks.remotefilepreviewgenerator;

/**
 * Interface to the executable used to generate a preview
 */
public interface ExternalPreviewProvider {
	
	public boolean isInstalled();
	public boolean isRunning();
	public void start();
	public void kill();
	
}

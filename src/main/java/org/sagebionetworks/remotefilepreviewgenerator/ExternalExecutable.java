package org.sagebionetworks.remotefilepreviewgenerator;

/**
 * Interface to the executable used to generate a preview
 */
public interface ExternalExecutable {
	
	public String getExecPath();
	public boolean isInstalled();
	public boolean isBusy();
	public void start();
	public void stop();
	
}

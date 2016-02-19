package org.sagebionetworks.remotefilepreviewgenerator;

public class ImageMagickProvider implements ExternalPreviewProvider {
	
	private String execPath;
	
	public String getExecPath() {
		return this.execPath;
	}
	
	public void setExecPath(String path) {
		this.execPath = path;
	}

	@Override
	public boolean isInstalled() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean isRunning() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void start() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void kill() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}

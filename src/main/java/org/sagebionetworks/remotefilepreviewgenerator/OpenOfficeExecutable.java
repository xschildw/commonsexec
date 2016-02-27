package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
class OpenOfficeExecutable implements ExternalExecutable {

	private String execPath;
	private boolean busy;
	
	@Inject
	public OpenOfficeExecutable(Configuration configuration) {
		this.execPath = configuration.getOpenOfficePath();
	}
	
	@Override
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
	public boolean isBusy() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void start() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void stop() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}

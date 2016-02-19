package org.sagebionetworks.remotefilepreviewgenerator;

import java.io.File;

public class OpenOfficePreviewGenerator implements ExternalPreviewGenerator {
	private OpenOfficeProvider provider;

	public OpenOfficePreviewGenerator(OpenOfficeProvider provider) {
		this.provider = provider;
	}
	
	public OpenOfficeProvider getProvider() {
		return this.provider;
	}
	
	public void setOpenOfficeProvider() {
		this.provider = provider;
	}
	
	@Override
	public File generatePreview(File input) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}

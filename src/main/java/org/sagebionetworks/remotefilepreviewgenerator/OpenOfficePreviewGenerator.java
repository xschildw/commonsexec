package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.io.File;
import java.util.List;

@Singleton
public class OpenOfficePreviewGenerator implements ExternalPreviewGenerator {
	
	private final OpenOfficeExecutable executable;

	@Inject
	public OpenOfficePreviewGenerator(@OpenOffice ExternalExecutable executable) {
		this.executable = (OpenOfficeExecutable) executable;
	}
	
	@Override
	public File generatePreview(File input) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public ExternalExecutable getExecutable() {
		return this.executable;
	}

	@Override
	public List<String> getupportedFileTypes() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}

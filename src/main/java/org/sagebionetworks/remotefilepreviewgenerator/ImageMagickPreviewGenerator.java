package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.io.File;

@Singleton
public class ImageMagickPreviewGenerator implements ExternalPreviewGenerator {
	
	private final ImageMagickExecutable executable;
	
	@Inject
	public ImageMagickPreviewGenerator(ImageMagickExecutable executable) {
		this.executable = executable;
	}

	@Override
	public File generatePreview(File input) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public ExternalExecutable getExecutable() {
		return this.executable;
	}
	
}

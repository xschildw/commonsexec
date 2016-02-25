package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.io.File;

@Singleton
public class ImageMagickPreviewGenerator implements ExternalPreviewGenerator {
	
	private final ImageMagickExecutable provider;
	
	@Inject
	public ImageMagickPreviewGenerator(ImageMagickExecutable provider) {
		this.provider = provider;
	}
	
	public ImageMagickExecutable getImageMagickProvider() {
		return this.provider;
	}

	@Override
	public File generatePreview(File input) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}

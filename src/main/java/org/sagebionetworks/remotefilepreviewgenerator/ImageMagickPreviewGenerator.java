package org.sagebionetworks.remotefilepreviewgenerator;

import java.io.File;

public class ImageMagickPreviewGenerator implements ExternalPreviewGenerator {
	
	private ImageMagickProvider provider;
	
	public void setImageMagickProvider(ImageMagickProvider provider) {
		this.provider = provider;
	}
	
	public ImageMagickProvider getImageMagickProvider() {
		return this.provider;
	}

	@Override
	public File generatePreview(File input) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}

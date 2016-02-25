package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.AbstractModule;

public class ExternalPreviewModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ExternalExecutable.class).to(ImageMagickExecutable.class);
		bind(ExternalPreviewGenerator.class).to(ImageMagickPreviewGenerator.class);
	}
	
}

package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.AbstractModule;

public class ExternalPreviewModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ExternalExecutable.class).annotatedWith(ImageMagick.class).to(ImageMagickExecutable.class);
		bind(ExternalPreviewGenerator.class).annotatedWith(ImageMagick.class).to(ImageMagickPreviewGenerator.class);
		bind(ExternalExecutable.class).annotatedWith(OpenOffice.class).to(OpenOfficeExecutable.class);
		bind(ExternalPreviewGenerator.class).annotatedWith(OpenOffice.class).to(OpenOfficePreviewGenerator.class);
	}
	
}

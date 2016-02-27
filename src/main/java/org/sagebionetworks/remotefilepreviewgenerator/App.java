package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

public class App {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ExternalPreviewModule());
		ExternalExecutable imageMagickExecutable = injector.getInstance(Key.get(ExternalExecutable.class, ImageMagick.class));
		ExternalPreviewGenerator imageMagickGenerator = injector.getInstance(Key.get(ExternalPreviewGenerator.class, ImageMagick.class));
		ExternalExecutable openOfficeExecutable = injector.getInstance(Key.get(ExternalExecutable.class, OpenOffice.class));
		ExternalPreviewGenerator openOfficeGenerator = injector.getInstance(Key.get(ExternalPreviewGenerator.class, OpenOffice.class));
		System.out.println(imageMagickExecutable.getExecPath());
		System.out.println(openOfficeExecutable.getExecPath());
	}
	
}

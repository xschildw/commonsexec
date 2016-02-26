package org.sagebionetworks.remotefilepreviewgenerator;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ExternalPreviewModule());
		ExternalExecutable executable = injector.getInstance(ExternalExecutable.class);
		ExternalPreviewGenerator generator = injector.getInstance(ExternalPreviewGenerator.class);
		System.out.println(executable.getExecPath());
	}
	
}

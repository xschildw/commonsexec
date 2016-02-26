package org.sagebionetworks.remotefilepreviewgenerator;

import java.io.File;

public interface ExternalPreviewGenerator {
	public ExternalExecutable getExecutable();
	public File generatePreview(File input);
}

package org.sagebionetworks.remotefilepreviewgenerator;

import java.io.File;

public interface ExternalPreviewGenerator {
	public File generatePreview(File input);
}
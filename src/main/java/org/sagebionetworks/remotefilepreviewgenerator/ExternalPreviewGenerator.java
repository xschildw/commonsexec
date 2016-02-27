package org.sagebionetworks.remotefilepreviewgenerator;

import java.io.File;
import java.util.List;

public interface ExternalPreviewGenerator {
	public ExternalExecutable getExecutable();
	public File generatePreview(File input);
	public List<String> getupportedFileTypes();
}

package chinesehandle.support;

class RedirectedObject implements Comparable<RedirectedObject>{
	private String sourcePath;
	
	private String redirectUrl;
	
	private String redirectDocumentId;

	public String getSourcePath() {
		return sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getRedirectDocumentId() {
		return redirectDocumentId;
	}

	public void setRedirectDocumentId(String redirectDocumentId) {
		this.redirectDocumentId = redirectDocumentId;
	}

    public String toString() {
    	return "    },\r\n" + 
    		   "    {\r\n" +
    		   "      \"source_path\": \"" + sourcePath + "\",\r\n" + 
    		   "      \"redirect_url\": \"" + redirectUrl + "\",\r\n" + 
    		   "      \"redirect_document_id\": " + redirectDocumentId + "\r\n";
    	
    }

	@Override
	public int compareTo(RedirectedObject newObj) {
		if(this.sourcePath != null && newObj.getSourcePath() != null && this.sourcePath.compareTo(newObj.sourcePath) > 0) {
			return 1;
		} else {
			return -1;
		}
	}

    
	
}

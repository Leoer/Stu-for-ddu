package before_customization_2.details;

import org.apache.commons.lang3.StringUtils;

public class FileStatus implements Comparable<FileStatus>{

	private String filePath;
	
	private int fileDepth;

	private String filePathForSort;
	
	private String fileStatus;
	
	private String fileComment;
	
	private int diffCount = -1;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public int getFileDepth() {
		if (this.filePath == null) {
			this.fileDepth = 0;
		} else {
			if (this.fileDepth == 0) {
				this.fileDepth = StringUtils.countMatches(filePath, "/");
			}
		}
		
		return fileDepth;
	}
	
	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public String getFileComment() {
		return fileComment;
	}

	public void setFileComment(String fileComment) {
		this.fileComment = fileComment;
	}

	public int getDiffCount() {
		return diffCount;
	}

	public void setDiffCount(int diffCount) {
		this.diffCount = diffCount;
	}
	
	public String getFilePathForSort() {
		if (this.filePath == null) {
			this.filePathForSort = null;
		} else {
			if (this.filePathForSort == null) {
				int maxDepth = 5;
				String fileFolder = this.filePath.substring(0, this.filePath.lastIndexOf("/") + 1);
				String fileName = this.filePath.replace(fileFolder, "");
				
				if(fileName.toLowerCase().equals("index.yml")) {
					fileName =  "zz" + fileName;
				}
				
				if(fileName.toLowerCase().equals("toc.yml")) {
					fileName = "zzz" + fileName;
				}

				this.filePathForSort = fileFolder;
				for (int i = 0; i < maxDepth - this.getFileDepth(); i++) {
					this.filePathForSort += "1/";
				}

				this.filePathForSort = this.filePathForSort + fileName;
			}
		}

		return filePathForSort;
	}
	 
	@Override
	public int compareTo(FileStatus o) {
		if (o.getFileStatus().compareTo(this.fileStatus) != 0) {

			return o.getFileStatus().compareTo(this.fileStatus);
		} else {
			return this.getFilePathForSort().compareTo(o.getFilePathForSort());
		}
	}
}

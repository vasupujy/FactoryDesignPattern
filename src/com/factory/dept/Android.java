package com.factory.dept;

public class Android extends DepartMent {
	private String project;
	private String timeLine;
	private String codePattern;
	private String teamSize;

	public Android(String project, String timeLine, String codePattern,
			String teamSize) {
		this.project = project;
		this.timeLine = timeLine;
		this.codePattern = codePattern;
		this.teamSize = teamSize;
	}

	public String getProject() {
		// TODO Auto-generated method stub
		return this.project; 
	}

	public String getTimeLine() {
		// TODO Auto-generated method stub
		return this.timeLine;
	}

	public String getCodePattern() {
		// TODO Auto-generated method stub
		return this.codePattern;
	}

	public String getTeamSize() {
		// TODO Auto-generated method stub
		return this.teamSize;
	}

}

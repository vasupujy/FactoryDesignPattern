package com.factory.dept;

public class Php extends DepartMent {
	String project;
	String timeLine;
	String codePattern;
	String temSize;

	public Php(String project, String timeLine, String codePattern,
			String teamSize) {
		this.project = project;
		this.timeLine = timeLine;
		this.codePattern = codePattern;
		this.temSize = teamSize;
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
		return this.temSize;
	}

}

package com.design.abstdesignpattern;

public class PhpFactory implements DepartMentAbstractFactory {
	private String project;
	private String timeLine;
	private String codePattern;
	private String teamSize;

	public PhpFactory(String project, String timeLine, String codePattern,
			String teamSize) {
		this.project = project;
		this.timeLine = timeLine;
		this.codePattern = codePattern;
		this.teamSize = teamSize;
	}

	public DepartMent createDepartment() {
		// TODO Auto-generated method stub
		return new Php(project, timeLine, codePattern, teamSize);
	}

}

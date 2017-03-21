package com.factory.dept;

import java.io.Serializable;

public class DepartMentFactory implements Serializable{

	private static DepartMentFactory departMentFactory = new DepartMentFactory();

	public static DepartMentFactory getInstance() {
		return departMentFactory;
	}

	public DepartMent getDepartDetail(String deptType, String project,
			String timeLine, String codePattern, String teamSize) {
		if (deptType.equals("Android")) {
			return new Android(project, timeLine, codePattern, teamSize);
		} else if (deptType.endsWith("Php")) {
			return new Php(project, timeLine, codePattern, teamSize);
		}
		return null;
	}
}

package com.factory.dept;

public class DepartMentFactory {

	public static DepartMent getDepartDetail(String deptType, String project,
			String timeLine, String codePattern, String teamSize) {
		if (deptType.equals("Android")) {
			return new Android(project, timeLine, codePattern, teamSize);
		} else if (deptType.endsWith("Php")) {
			return new Php(project, timeLine, codePattern, teamSize);
		}
		return null;
	}
}

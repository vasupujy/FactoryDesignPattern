package com.design.abstdesignpattern;

public class Android extends DepartMent {
	private String project;
	private String timeLine;
	private String codePattern;
	private String teamSize;
	private boolean isTimeLineOptional;
	private boolean isCodePatternOptional;

	public Android(AndroidBuilder builder) {
		this.project = builder.project;
		this.timeLine = builder.timeLine;
		this.codePattern = builder.codePattern;
		this.teamSize = builder.teamSize;
		this.isTimeLineOptional = builder.isTimeLineOptional;
		this.isCodePatternOptional = builder.isCodePatternOptional;
	}

	public boolean isTimeLineOptional() {
		return isTimeLineOptional;
	}

	public boolean isCodePatternOptional() {
		return isCodePatternOptional;
	}

	public String getProject() {
		// TODO Auto-generated method stub
		return this.project;
	}

	public String getTimeLine() {
		// TODO Auto-generated method stub
		if (isTimeLineOptional) {
			return "";
		} else {
			return this.timeLine;
		}
	}

	public String getCodePattern() {
		// TODO Auto-generated method stub
		return this.codePattern;
	}

	public String getTeamSize() {
		// TODO Auto-generated method stub
		return this.teamSize;
	}

	public static class AndroidBuilder {
		private String project;
		private String timeLine;
		private String codePattern;
		private String teamSize;
		private boolean isTimeLineOptional;
		private boolean isCodePatternOptional;

		public AndroidBuilder(String project, String timeLine,
				String codePattern, String teamSize) {
			this.project = project;
			this.timeLine = timeLine;
			this.codePattern = codePattern;
			this.teamSize = teamSize;
		}

		public AndroidBuilder setTimeLineIsOptional(boolean isTimeLineOptional) {
			this.isTimeLineOptional = isTimeLineOptional;
			return this;
		}

		public Android build() {
			return new Android(this);
		}

	}

}

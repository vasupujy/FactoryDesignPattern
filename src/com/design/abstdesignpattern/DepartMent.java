package com.design.abstdesignpattern;

public abstract class DepartMent {

	public abstract String getProject();

	public abstract String getTimeLine();

	public abstract String getCodePattern();

	public abstract String getTeamSize();

	public String toString() {
		// print all type config of Department
		return "ProjectTpe=" + this.getProject() + "Timeline in Year"
				+ this.getTimeLine() + "Code Pattern" + this.getCodePattern()
				+ "Team Size" + this.getTeamSize();
	}


}

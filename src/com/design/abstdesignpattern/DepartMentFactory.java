package com.design.abstdesignpattern;

public class DepartMentFactory {

	public static DepartMent getDeptDetail(DepartMentAbstractFactory factory) {
		return factory.createDepartment();
	}
}

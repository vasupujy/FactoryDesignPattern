package com.design.abstdesignpattern;

public class DetailDepartMent {
	public static void main(String[] args) {

		DepartMent pc = DepartMentFactory.getDeptDetail(new AndroidFactory(
				"Spade", "12 months", "mvvm", "12"));
		DepartMent server = DepartMentFactory.getDeptDetail(new PhpFactory(
				"Andrid", "12 months", "mvvm", "12"));
		System.out.println("AbstractFactory PC Config::" + pc.getCodePattern());
		System.out.println("AbstractFactory Server Config::" + server);
	}
}

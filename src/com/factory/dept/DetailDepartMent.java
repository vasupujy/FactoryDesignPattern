package com.factory.dept;

public class DetailDepartMent {
	public static void main(String[] args) {

		DepartMent android = DepartMentFactory.getInstance().getDepartDetail(
				"Android", "Spade", "12 months", "dataBinding", "2 member");
		// set configuration of server
		DepartMent php = DepartMentFactory.getInstance().getDepartDetail("Php",
				"Spade", "12 months", "mvc", "3 member");
		// print confugiration of pc
		System.out.println("Factory PC Config::" + android);
		System.out.println("Factory Server Config::" + php);
		System.out.println("Android hash code:  "+DepartMentFactory.getInstance().hashCode());
		System.out.println("Php Hash code:  "+DepartMentFactory.getInstance().hashCode());
		
	}
}

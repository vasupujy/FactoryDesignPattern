package com.design.abstdesignpattern;

public class DepartMentFactory {
	
	  private static DepartMentFactory instance;
	    
	    private DepartMentFactory(){}
	    
	   //create a single instance  in java
	    public static DepartMentFactory getInstance(){
	    	if(instance==null){
	    		instance = new DepartMentFactory();
	    	}
	        return instance;
	    }
	
	public  DepartMent getDeptDetail(DepartMentAbstractFactory factory) {
		return factory.createDepartment();
	}
	
	public String print(){
		return "print";
	}

}

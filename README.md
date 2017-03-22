# FactoryDesignPattern

Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-classes. This pattern takes out the responsibility of instantiation of a class from client program to the factory class. We can apply Singleton pattern on Factory class or make the factory method static. Super class in factory pattern can be an interface or a normal java class.

for example below code can explai you how can do this

first of all you are create a abstract class in define which you have a common propery of your module

for example create a abstract class Department

```java
public abstract class DepartMent {

public abstract String getProject();

/* Define your common propertis which you have use in all subclass here i have a define a property which use in all subclasses like in
android or php department in android and php is subclasses.*/


}
```

create a first subclass Android
```java
public class Android extends DepartMent {
/*
Define your common property of subclass
*/
	public Android(AndroidBuilder builder) {
	/*
Define your common property of subclass
*/
	}
  }
```

create a second subclass Android
```java
public class Php extends DepartMent {
/*
Define your common property of subclass
*/
	public Android(AndroidBuilder builder) {
	/*
Define your common property of subclass
*/
	}
  }
```
  
  create a factory class of Department
  
  ```java
  public class DepartMentFactory {
	public static Computer getDepartment(String type, String ram, String hdd,
			String cpu) {
		// pass dynamic in main method to call if pc then print config
		if ("Android".equalsIgnoreCase(type))
			return new Android("value");
		else if ("Php".equalsIgnoreCase(type))
			return new Php("value");
		return null;

	}
}
```

in your main class call like this
```java
public class DetailDepartMent {
	public static void main(String[] args) {

		DepartMent android = DepartMentFactory.getDeptDetail(new AndroidFactory(
				"Spade", "120 months", "mvvm", "12"));
		DepartMent php = DepartMentFactory.getDeptDetail(new PhpFactory(
				"Andrid", "12 months", "mvvm", "12"));
	  System.out.println("DetailDepartMent" + android);
    System.out.println("DetailDepartMent" + php);
	}
}
```
so you can easily modify in factory and saprate subclasses

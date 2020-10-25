package lar2;

public class Course {
	int courseId;
	String courseName;
	String venue;
	
	 Course(int a,String b,String c) {
		this.courseId=a;
		this.courseName=b;
		this.venue=c;
	 
	
		System.out.println("课程编号："+a+" 课程名称："+b+"上课地点"+c);
	 }     
}


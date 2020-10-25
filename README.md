# lar2
实验目的
（1）初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法.
（2）掌握面向对象的类设计方法（属性、方法）.
（3）掌握类的继承用法，通过构造方法实例化对象.
 
 
实验要求
（1）编写上述实体类以及测试主类.
（2）在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
  
  
核心代码
（1）	    	Teacher teacher;
	    	teacher = new Teacher();
	    	teacher.id=1;
	    	teacher.teacherName="zhang";
        //创建Teacher类实体，给teacher的属性赋值
（2）
	 Course(int a,String b,String c) {
		this.courseId=a;
		this.courseName=b;
		this.venue=c;
	 
	
		System.out.println("课程编号："+a+" 课程名称："+b+"上课地点"+c);
    //构造Course方法
    
    
    实验感想
    本次实验可以独立的定义类，属性，创建对象，给对象赋值，对于老师要求的模拟学生选课和退课，还是不知道如何下手，有很多编程错误的地方不知道怎么调试。

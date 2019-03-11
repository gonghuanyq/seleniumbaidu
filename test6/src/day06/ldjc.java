package day06;


class student{
	static String schoolname="石阡中学";
	private String name;
	private String sex;
	private int age;
	//public student() {}
	public student(String name,String sex,int age)  {
        this.name=name;
		this.sex=sex;
		this.age=age;
}	

public void setname(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return this.age;
}
public void outInfo() {
	System.out.println("该同学叫："+this.name+"   性别是："+this.sex+"   年龄为："+this.age);
}
}

class graduatestudent extends student{
	String speciallity;
	String teacher;
	public graduatestudent(String name,String sex,int age,String speciallity,String teacher) {
		super(name,sex,age);
	}

public void outInfo() {
	super.outInfo();
	System.out.println("专业"+this.speciallity+"导师"+this.teacher);
}
}
 
public class ldjc {
    
	public static void main(String[] args) {
		
		student s1=new student("小明","男",18);
		student s2=new student("貂蝉","女",18);
		s1.setAge(s1.getAge()+1);
		s2.setAge(s2.getAge()+1);
		if(s1.getAge()<20) {
			s1.outInfo();
		}
		if(s2.getAge()<20) {
			s2.outInfo();
		}
		System.out.println(s1.schoolname);
	    //System.out.println(s2.schoolname);
	}
	
}


package com.nnxy.model;

/**
 * @author huangbangyi
 * create date : 2019/5/16
 * description : Ñ§ÉúµÄÊµÌåÀà
 */
public class Student {

	private int id;//唯一ID
	private String name;// 姓名
	private int sex;// 性别
	private int age;//年龄
	
	
	public Student(int id, String name, int sex, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

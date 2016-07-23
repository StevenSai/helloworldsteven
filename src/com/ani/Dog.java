package com.ani;

public class Dog extends Animal {

	public int age = 10;
	public String name = null;
	
	public void setDog(String name,int age){
		this.name = name;
		this.age  = age;
	}
	
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void eat(){
		super.eat();
		System.out.println("Dogchichi"+" "+age+" "+name+"\n"+this);
	}
}

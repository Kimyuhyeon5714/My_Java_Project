package icehs.science.chapter08;

import icehs.science.chapter06.Student;

public class StudentArrayTest {

	public static void main(String[] args) {
		StudentClass[] st = new StudentClass[3];
		st[0] = new StudentClass("강감찬","STU001","010-1234-5678");
		st[1] = new StudentClass("이순신","STU002","010-2345-6789");
		st[2] = new StudentClass("김유신","STU003","010-2312-4214");
		
		for(int i = 0; i < st.length; i++) {
			st[i].printStudentInfo();
		}
	}

}

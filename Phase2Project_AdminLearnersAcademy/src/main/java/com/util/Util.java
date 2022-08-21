package com.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.Classes.ClassDetails;
import com.Classes.StudentDetails;
import com.Classes.SubjectDetails;
import com.Classes.TeacherDetails;

public class Util {
	
		private static SessionFactory factory;
		
		public static SessionFactory buildConnection() {
			
			factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(StudentDetails.class)	
					.addAnnotatedClass(TeacherDetails.class)
					.addAnnotatedClass(ClassDetails.class)
					.addAnnotatedClass(SubjectDetails.class)
					.buildSessionFactory();
			
			return factory;
		}
	
}

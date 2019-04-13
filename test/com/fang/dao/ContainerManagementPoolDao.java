package com.fang.dao;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ContainerManagementPoolDao {
	public Connection showConnection(){
		Configuration cfg = new Configuration().configure();
		SessionFactory fac = cfg.buildSessionFactory();
		Session s = fac.openSession();
		try{
			Connection conn = s.connection();
			System.out.println(conn);
			return conn;
		}finally{
			s.close();
		}
		
	}
}

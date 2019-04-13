package com.fang.connPool;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class ConnPoolTest {
	
	
	@Test
	public void test() {
		Configuration cfg = new Configuration().configure();
		SessionFactory fac = cfg.buildSessionFactory();
		Session s = fac.openSession();
		
		Connection conn = s.connection();
		System.out.println(conn);
		s.close();
	}

	@Test
	public void testC3p0Pool() {
		Configuration cfg = new Configuration().configure();
		SessionFactory fac = cfg.buildSessionFactory();
		Session s = fac.openSession();
		
		Connection conn = s.connection();
		System.out.println(conn);
		s.close();
	}
	
	
	@Test
	public void testdbcpPool() {
		Configuration cfg = new Configuration().configure();
		SessionFactory fac = cfg.buildSessionFactory();
		Session s = fac.openSession();
		
		Connection conn = s.connection();
		System.out.println(conn);
		s.close();
	}
	
	
	
	
	
	@Test
	public void test1() {
		Configuration cfg = new Configuration().configure();
		SessionFactory fac = cfg.buildSessionFactory();
		Session s = fac.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Connection conn = s.connection();
		System.out.println(conn);
		
		
		s.close();
	}
}

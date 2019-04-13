package com.fang.createSchema;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class CreateSchema {

	@Test
	public void test() {
		Configuration cfg=new AnnotationConfiguration().configure();
		SchemaExport se=new SchemaExport(cfg);
		se.create(true, true);
	}
}

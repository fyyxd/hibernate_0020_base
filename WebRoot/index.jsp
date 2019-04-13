<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	Context ctx=new InitialContext();
	DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/test");
	Connection conn=ds.getConnection();
	out.println(conn);
	PreparedStatement ps=conn.prepareStatement("select sysdate from dual");
	ResultSet rs=ps.executeQuery();
	if(rs.next()){
		Date dd=rs.getDate(1);
		out.println(dd);
	}
	rs.close();
%>

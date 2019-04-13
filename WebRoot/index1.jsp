<%@page import="com.fang.dao.ContainerManagementPoolDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	ContainerManagementPoolDao dao=new ContainerManagementPoolDao();
    dao.showConnection();
%>

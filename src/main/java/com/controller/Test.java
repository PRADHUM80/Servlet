package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	
	
//	it can handle the data from HTTP Request(GET)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullname");
		String address = request.getParameter("address");
		
		System.out.println(fullname + " " + address);
}
}
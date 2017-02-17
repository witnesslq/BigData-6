package cn.kevin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.kevin.service.CustomerService;
import cn.kevin.service.impl.CustomerServiceImpl;

public class DeleteOneCustomer extends HttpServlet{
	private CustomerService s = new CustomerServiceImpl(); 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String CustomerId = request.getParameter("customerId");
		s.delCustomer(CustomerId);
		response.sendRedirect(request.getContextPath()+"/servlet/showallcustomer");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

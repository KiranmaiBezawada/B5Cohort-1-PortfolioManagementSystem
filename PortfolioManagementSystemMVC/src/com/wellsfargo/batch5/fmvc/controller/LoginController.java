package com.wellsfargo.batch5.fmvc.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wellsfargo.batch5.fmvc.model.Login;
import com.wellsfargo.batch5.fmvc.service.IUserService;
import com.wellsfargo.batch5.fmvc.service.UserServiceImpl;

@WebServlet("/li")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IUserService loginService;

	public void init(ServletConfig config) throws ServletException {
		loginService = new UserServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Login login = new Login();
		;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.study.array.survlet;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/data/addition")
public class DatainsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StringBuilder json = new StringBuilder();
		String requestData = null;

		// 스트림에서 json(문자열) 받아옴
		BufferedReader reader = request.getReader();
		while ((requestData = reader.readLine()) != null) {
			json.append(requestData);
		}

		Gson gson = new Gson();

	}

}

package pers.ken.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;

import pers.ken.ssm.po.Items;

public class ItemsController2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//调用service查找 数据库，查询商品列表，这里使用静态数据模拟
				List<Items> itemsList = new ArrayList<Items>();
				//向list中填充静态数据
				
				Items itemx = new Items();
				
				Items items_1 = new Items();
				items_1.setName("mac pro笔记本");
				items_1.setPrice(9080f);
				items_1.setDetail("mac pro 笔记本厉害！");
				
				Items items_2 = new Items();
				items_2.setName("苹果手机");
				items_2.setPrice(6500f);
				items_2.setDetail("iphone6苹果手机！");
				
				itemsList.add(items_1);
				itemsList.add(items_2);

				//返回ModelAndView
				ModelAndView modelAndView =  new ModelAndView();
				//设置模型数据
				request.setAttribute("itemsList", itemsList);
				//设置转发的视图
				request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
				
				//使用此方法可以通过修改response，设置响应的数据格式，比如响应json数据
	}
	
}

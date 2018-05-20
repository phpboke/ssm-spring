package pers.ken.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pers.ken.ssm.po.Items;

public class ItemsController1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Items> itemsList = new ArrayList<Items>();
		
		//构造数组数据
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("thinpad t440s 笔记本好呀");
		
		Items items_2 = new Items();
		items_2.setName("vivi手机");
		items_2.setPrice(1900f);
		items_2.setDetail("vivi照亮你的美!!!");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/itemsList");
		
		return modelAndView;
	}
	
}

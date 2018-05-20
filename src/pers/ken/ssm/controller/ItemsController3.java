package pers.ken.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pers.ken.ssm.po.Items;

/**
 * @desc 注解开发handler
 * @author ken
 *
 */
@Controller
public class ItemsController3 {
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception{
		
		//调用service查找 数据库，查询商品列表，这里使用静态数据模拟
		List<Items> itemsList = new ArrayList<Items>();
		//向list中填充静态数据
		
		Items items_1 = new Items();
		items_1.setName("注解惠普笔记本");
		items_1.setPrice(9080f);
		items_1.setDetail("注解惠普笔记本厉害！");
		
		Items items_2 = new Items();
		items_2.setName("注解手机aaaaa");
		items_2.setPrice(9500f);
		items_2.setDetail("iphone8苹果手机！");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		ModelAndView modelAndView = new ModelAndView();
		//返回ModelAndView
		modelAndView.addObject("itemsList", itemsList);
		//指定视图.在视图解析器中配置了jsp路径的前缀和jsp的后缀，这里就不需要再指定完整路径
		//modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("items/itemsList");
		
		return modelAndView;
		
	}

/*	@Override
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
	}*/
	
}

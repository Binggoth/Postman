package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.mapper.UserMapper;
import com.zhiyou100.model.User;
import com.zhiyou100.util.ResultObject;

//演示前后端分离开发

@RestController //该类中的所有方法都返回JSON数据,不用每个方法都写@ResponseBody
public class UserController {

	@Autowired
	protected UserMapper mapper;
	
	//查全部
	//get/user/get 参数无 返回ResultObject:{"code":"这里写状态码","msg":"提示信息","data":"数据"}
	@RequestMapping(value="/user/get",method=RequestMethod.GET)
	public ResultObject getAll() {
		List<User> users = mapper.getAllUser();
		if(users == null || users.size() == 0) {
			return new ResultObject(201,"没有数据",null);
			
		}
		return new ResultObject(200,"成功",users);
	}
	
	//查一个
	//get/uer/get/{id} 参数 int id 返回值..
	@RequestMapping(value="/user/get/{id}",method=RequestMethod.GET)
	public ResultObject getUserbById(@PathVariable int id){
		System.out.println("getUserById id: "+id);
		User user = mapper.getUserById(id);
		System.out.println("getUserById user: "+user);
		return new ResultObject(200,"成功",user);
		
	}
	
	//添加用户
	//post/user/add 返回值
	//参数User user
	//  以form表单发送: postman测试要使用form-data形式发送
	//  ajax默认形式: x-www-form-urlencoded
	//  ajax发送JSON: postman : row -> json
	//     且,如果前台发送的json数据,后台要封装进对象,需要使用
	//     @RequestBody 解析json数据,才能封装
	
	@RequestMapping(value="/user/get",method=RequestMethod.POST)
	public ResultObject addUser(@RequestBody User user){
		System.out.println("addUser id: "+user);
		int row = mapper.addUser(user);
		if(row > 0) {
			return new ResultObject(200,"成功",null);
		}
		return new ResultObject(404,"失败",null);
	}
	
	//删除一个
	//delete /user/delete/{id} 
	@RequestMapping(value="/user/delete/{id}",method=RequestMethod.DELETE)
	public ResultObject deleteUser(@PathVariable int id){
		System.out.println("addUser id: "+id);
		int row = mapper.deleteUserById(id);
		if(row > 0) {
			return new ResultObject(200,"成功",null);
		}
		return new ResultObject(404,"没有该用户",null);
	}
	
	//更新一个
		//delete /user/update/ 
		@RequestMapping(value="/user/update",method=RequestMethod.PUT)
		public ResultObject updateUserById(@RequestBody User user){
			System.out.println("updateUserById id: "+user.getId());
			int row = mapper.updateUserById(user.getId());
			if(row > 0) {
				return new ResultObject(200,"成功",null);
			}
			return new ResultObject(404,"没有该用户",null);
		}
	
}

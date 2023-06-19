package com.example.onlinebook2;

import com.example.onlinebook2.entity.Content;
import com.example.onlinebook2.entity.User;
import com.example.onlinebook2.mapper.ContentMapper;
import com.example.onlinebook2.mapper.UserMapper;
import com.example.onlinebook2.service.impl.ContentServiceImpl;
import com.example.onlinebook2.service.impl.UserServiceImpl;
import com.example.onlinebook2.util.MD5Util;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.onlinebook2.service.UserService;

import java.util.Date;
import java.util.UUID;

@SpringBootTest
class Onlinebook2ApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ContentMapper contentMapper;
	@Autowired
	private ContentServiceImpl csi;
	@Autowired
	private UserServiceImpl usi;
	@Test
	void contextLoads() {
		// 通过uid获取用户
//		User user = userMapper.findUserByUid("7925ac6c2990499da7380b20f26df6e6");
//		System.out.println(user.getPassWord());
//		System.out.println(user.getUserName());
//		System.out.println(user.getRegisTime());

		// 注册用户
//		UUID uuid = UUID.randomUUID();
//		user = new User(uuid.toString().replace("-", ""),new Date(),"admin","32187321");
//		userMapper.registerUser(user);

//		//使用Service层封装获取用户
//		User user = usi.findUserByUid("a864c109a9884ea99e6d49c7af0685db");
//		System.out.println(user.getPassWord());
//		System.out.println(user.getUserName());
//		System.out.println(user.getRegisTime());
//		String uid = uuid.toString();
//		uid = uid.replace("-", "");
//		System.out.println(uid);
//		String text = "hello world,write text test!";
//		Date date = new Date();
//		String cid = MD5Util.getMD5(text+date.toString());
//		Content content = new Content("a864c109a9884ea99e6d49c7af0685db",cid,text,date);
//		System.out.println(cid);
//		csi.insertContent(content);
		String cid = "d866c62c21d603a78b255cdc13637101";
		contentMapper.updateContent("可不要为空呀",cid);




	}

}

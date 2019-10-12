package com.zhiyou100.test;

import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;

public class TestES {
	
	@Test
	public void testESAddIndex() {
		//创建客户端
		RestHighLevelClient cilent = new RestHighLevelClient(
				RestClient.builder(new HttpHost("192.168.",9200,"http"))
				);//ip, 端口, 请求协议
		
	}

}

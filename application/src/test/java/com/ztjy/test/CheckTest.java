package com.ztjy.test;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
/**
 * 
        * @Title 校验dubbo接口都写了单元测试用例
        * @Description facadeBasePackage和testBasePackage需要正确填写
		* @ClassName CheckTest
		* @Copyright 2014-现在 厦门神州鹰掌通家园项目组
		* @author 胡耀忠 huyaozhong
		* @date 2018年5月3日 下午5:26:40 
 *
 */
public class CheckTest {
	/**
	 * 接口所在基础包名
	 */
	private final String facadeBasePackage = "com.ztjy.facade";
	/**
	 * 单元测试类所在基础包
	 */
	private final String testBasePackage = "com.ztjy.xxxxserver.test.dubbo";
	
	@Test
	public void checkTest(){
		List<String> facadeMethods = new ArrayList<String>();
		List<String> testMethods = new ArrayList<String>();
		ClassScaner scaner = new ClassScaner();
		Set<Class> facadeList = scaner.doScan(facadeBasePackage);
		for(Class c : facadeList){
			if(StringUtils.endsWith(c.getName(), "Service") || StringUtils.endsWith(c.getName(), "Facade")){
				 Method[] methods = c.getDeclaredMethods();
			        //Loop through the methods and print out their names
			        for (Method method : methods) {
			            facadeMethods.add(method.getName());
			        }
			}
			 
		}
		facadeList = scaner.doScan(testBasePackage);
		for(Class c : facadeList){
				 Method[] methods = c.getDeclaredMethods();
			        for (Method method : methods) {
			        	testMethods.add(method.getName());
			        }
		}
		
		facadeMethods.removeAll(testMethods);

		if(!facadeMethods.isEmpty()){
			Assert.fail("还有"+facadeMethods.size()+"个接口方法未写单元测试用例.具体如下:"+StringUtils.join(facadeMethods, ","));
		}else{
			System.out.println("★★★★★★恭喜，所有接口方法均有单元测试用例!★★★★★★");
		}
		
		
	}
	
}

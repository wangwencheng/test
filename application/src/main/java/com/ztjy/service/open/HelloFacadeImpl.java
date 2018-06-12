
package com.ztjy.service.open;

import com.ztjy.xxxxserver.facade.HelloFacade;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
/**
 * 
        * @Title TODO 类描述
        * @Description TODO 详细描述
		* @ClassName HelloFacadeImpl
		* @Copyright 2014-现在 厦门神州鹰掌通家园项目组
		* @author 胡耀忠 huyaozhong
		* @date 2018年5月4日 上午10:36:48 
 *
 */
@Service(interfaceClass = HelloFacade.class,version = "1.0.0")
@Component
public class HelloFacadeImpl implements HelloFacade{

	/**
	 * 
	 * 方法描述: sayHello
	 * @param name
	 * @return  
	 * @author 胡耀忠 huyaozhong 2018年5月4日上午10:36:25
	 * @since V2.0.0
	 */
	public String sayHello(String name) {
		return "hello " + name;
	}
	
	
	
}

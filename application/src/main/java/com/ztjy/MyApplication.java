package com.ztjy;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * 
        * @Title 项目启动类
        * @Description TODO 详细描述
		* @ClassName MyApplication
		* @Copyright 2014-现在 厦门神州鹰掌通家园项目组
		* @author 胡耀忠 huyaozhong
		* @date 2018年5月4日 上午10:39:51 
 *
 */
@SpringBootApplication
@EnableDubboConfiguration
public class MyApplication {
    public static void main(String[] args) {
    	
    	String logPath = "log.path.prefix";
    	
    	//如果启动参数没设置日志的保存路径，则目录用logs
		if(StringUtils.isBlank(System.getProperty(logPath))){
            System.setProperty(logPath, ".");
		}
    	
        SpringApplication.run(MyApplication.class, args);
        System.out.println("");
    	String fozu =   
                "                   _ooOoo_"+"\n"+  
                "                  o8888888o"+"\n"+  
                "                  88\" . \"88"+"\n"+  
                "                  (| -_- |)"+"\n"+  
                "                  O\\  =  /O"+"\n"+  
                "               ____/`---'\\____"+"\n"+  
                "             .'  \\\\|     |//  `."+"\n"+  
                "            /  \\\\|||  :  |||//  \\"+"\n"+  
                "           /  _||||| -:- |||||-  \\"+"\n"+  
                "           |   | \\\\\\  -  /// |   |"+"\n"+  
                "           | \\_|  ''\\---/''  |   |"+"\n"+  
                "           \\  .-\\__  `-`  ___/-. /"+"\n"+  
                "         ___`. .'  /--.--\\  `. . __"+"\n"+  
                "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\"."+"\n"+  
                "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |"+"\n"+  
                "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /"+"\n"+  
                "======`-.____`-.___\\_____/___.-`____.-'======"+"\n"+  
                "                   `=---='"+"\n"+  
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+"\n"+  
                "\t佛祖保佑       永无BUG"+"\n"+
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+"\n"; 
        System.out.println(fozu);
    }
}

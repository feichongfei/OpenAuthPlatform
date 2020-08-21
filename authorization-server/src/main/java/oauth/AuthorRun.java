package oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@SpringBootApplication
public class AuthorRun extends SpringBootServletInitializer {

	List<HashMap<String,String>> credentials ;

	public AuthorRun(){
		credentials = new ArrayList<HashMap<String,String>>();
		//使用域账户 密码 测试
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("username", "feichong.wzt");
		map.put("password", "MnFei9401@mybank.cn");
		credentials.add(map);

		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("username", "ruoli.lrz");
		map1.put("password", "Li09_Panda#9901");
		credentials.add(map1);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AuthorRun.class);
	}

	 public static void main(String[] args) {
		

	        SpringApplication.run(AuthorRun.class, args);
	    }

}

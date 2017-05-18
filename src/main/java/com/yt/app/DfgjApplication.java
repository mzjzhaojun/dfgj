package com.yt.app;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.yt.app.frame.c.AppConfig;
import com.yt.app.frame.c.MySqlConfig;
import com.yt.app.frame.c.RedisConfig;
import com.yt.app.frame.i.Aq;

/**
 * Spring Boot main application class.
 * 
 * @createdate 2016年8月23日 下午3:17:42
 * 
 * @author zj
 */
@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableHypermediaSupport(type = { HypermediaType.HAL })
@EnableConfigurationProperties({ MySqlConfig.class, RedisConfig.class, AppConfig.class })
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class DfgjApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DfgjApplication.class);
	}

	/**
	 * Entry point for the application.
	 * 
	 * @param args
	 *            Command line arguments.
	 * @throws Exception
	 *             Thrown when an unexpected Exception is thrown from the
	 *             application.
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                             Ooo_");
		System.out.println("                           o8888888o");
		System.out.println("                          88\" . \"88");
		System.out.println("                           (| -_- |)");
		System.out.println("                            \\ = //O ");
		System.out.println("                        ____//---\\____");
		System.out.println("                      .   ' \\| |// `.");
		System.out.println("                       // \\||| : |||// \\");
		System.out.println("                     // _||||| -:- |||||- \\");
		System.out.println("                       | | \\\\ - //// | |");
		System.out.println("                     | \\_| ''\\---//'' | |");
		System.out.println("                      \\ .-\\__ `-` ___//-. //");
		System.out.println("                   ___`. .' //--.--\\ `. . __");
		System.out.println("                    // // `-. //_ __// \\__ _\\ .-` \\ ");
		System.out.println("                  | | : `- \\`.;`\\ _ //`;.`// - ` : | |");
		System.out.println("                   \\ \\ `-. \\_ __\\ //__ _// .-` // /");
		System.out.println("               ======`-.____`-.___\\_____//___.-`____.-'======");
		System.out.println("                               `=---='");
		System.out.println("");
		System.out.println("         .............................................");
		System.out.println("             佛祖镇楼     永无BUG     BUG辟易");
		System.out.println("        佛曰:");
		System.out.println("                写字楼里写字间，写字间里程序员；");
		System.out.println("                程序人员写程序，又拿程序换酒钱。");
		System.out.println("                酒醒只在网上坐，酒醉还来网下眠；");
		System.out.println("                酒醉酒醒日复日，网上网下年复年。");
		System.out.println("                但愿老死电脑间，不愿鞠躬老板前；");
		System.out.println("                奔驰宝马贵者趣，公交自行程序员。");
		System.out.println("                别人笑我忒疯癫，我笑自己命太贱；");
		System.out.println("                不见满街漂亮妹，哪个归得程序员？");
		System.out.println();
		SpringApplication.run(new Class[] { DfgjApplication.class }, args);
//		Aq.u().p(Arrays.asList("refundreport_copy"), true, true, false, null);
	}
}

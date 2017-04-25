package com.yt.app;

import java.util.Arrays;
import java.util.List;

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

import com.yt.app.frame.config.AppConfig;
import com.yt.app.frame.config.MySqlConfig;
import com.yt.app.frame.config.RedisConfig;
import com.yt.app.frame.generate.GenerateCode;

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
		List<String> tables = Arrays.asList("jobcode", "accountchargeallots", "accountchargeapplies", "accountchargeinvoices",
				"accountchargepayments", "accountdeductapplies", "accountrecords", "accountrefundallots", "accountrefundapplies",
				"accountrefundverifyings", "accountreturnapplies", "accounts", "accounttransferapplies", "assetconfirms", "assets",
				"assignconditions", "assignsaccompanies", "cachets", "campus_day_task", "campus_month_task", "campusassetsdetail",
				"campuschargestat", "campuscustomerweeklystat", "campuses", "campusincomestat", "campusincomeweeklystat", "campusrefundweeklystat",
				"campusrenewweeklystat", "campussalesweeklystat", "campustask", "campustaxrateconfig", "cashflowreport", "categories",
				"categorycatalogs", "chargereport", "classes", "classlessonitems", "classlessons", "consultant_month_task", "consultbranchcrmdaysum",
				"consultbranchcrmmonthsum", "consultbranchperfdaysum", "consultbranchperfmonthsum", "consultcampusperfdaysum",
				"consultcampusperfmonthsum", "consultcountryperfdaysum", "consultcountryperfmonthsum", "consultstaffperfdaysum", "country_code",
				"customer", "customeraccountmonthlystat", "customerassetsdetail", "customerassetsdetailsource", "customerassigns",
				"customerbasestat", "customercourses", "customerexpenserelations", "customerfollowitems", "customerfollows", "customermeetingitems",
				"customermeetings", "customerparentrelations", "customerrefundalerts", "customerrefunds", "customerrelations", "customerreplies",
				"customerreturnmoney", "customerschoolrelations", "customerscoreitems", "customerscores", "customerserviceitems", "customerservices",
				"customerstaffcharges", "customerstaffrelationships", "customerstopalerts", "customerteacherassignapplies", "customerteachercharges",
				"customerteacherrelations", "customertransferaccounts", "customertransferapplies", "customertransferassets",
				"customertransferresources", "customerverifies", "customervisits", "debookorderitems", "debookorders", "discountitems",
				"discountpermissions", "discounts", "educatebranchcrmmonthsum", "educatebranchperfdaysum", "educatebranchperfmonthsum",
				"educatecampuscrmmonthsum", "educatecampusperfdaysum", "educatecampusperfmonthsum", "educatecountrycrmmonthsum",
				"educatecountryperfdaysum", "educatecountryperfmonthsum", "educatestaffcrmmonthsum", "educatestaffperfdaysum",
				"educatestaffperfmonthsum", "educator_day_task", "educator_week_task", "educatoreffectivecustomer", "educatorreport_org",
				"educatorreport_staff", "email_messages", "expensepermissions", "expenses", "financialassignmonthlyincome", "hr_a_charges",
				"incomereport", "jobs", "log_sys_info", "log_user_info", "operationlog", "orderdailyinfo", "orderitems", "orders", "organizations",
				"orgbranches", "orgcampuses", "orgregions", "orgstaffjobs", "otherproductincome", "otherproductincomeweekly", "parents",
				"perfindexreport", "phones", "pinyin", "posrecords", "potentialcustomers", "presentitems", "presents", "productclassstats",
				"productpermissions", "products", "productsalaryrules", "productsexofcourse", "ps_teacherteachings", "refundreport", ""
						+ "repertories", "rooms", "schools", "staffbasestat", "staffchargestat", "staffrefundstat", "staffresources", "staffs",
				"stafftask", "studentstatusreport", "" + "teachbranchcrmmonthsum", "teachbranchperfmonthsum", "teachcampuscrmmonthsum",
				"teachcampusperfmonthsum", "teachcountrycrmmonthsum", "teachcountryperfmonthsum", "teacher_day_task", "teacherchargeallots",
				"teacherjobs", "teacherrefundallots", "teacherreport_org", "teacherreport_staff", "teachers", "teachersearch", "teacherteachings",
				"teachgroupcrmmonthsum", "teachgroupperfmonthsum", "teachstaffcrmmonthsum", "teachstaffperfmonthsum", "user_operation_log",
				"user_task", "user_task_category");
		SpringApplication.run(new Class[] { DfgjApplication.class }, args);
//		GenerateCode.getInstance().crud(tables, false, true, true, "854616254684729344");
		// GenerateCode.getInstance().crud(tables, false, true);
	}
}

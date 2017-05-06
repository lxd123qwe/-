package test;


import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Test {
	public static void main(String[] args) {
		System.out.println("1");
		//读取配置文件z
		Configuration cfg=new Configuration().configure();
		System.out.println("2");
		SchemaExport export=new SchemaExport(cfg);
		//第一个true：是否显示sql语句，
		//第二个true：原来有内容是否刷新
		export.create(true, true);
		
			
	}

}

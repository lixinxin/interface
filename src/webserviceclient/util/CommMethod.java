package webserviceclient.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CommMethod {
	//获取数据库连接
	private static SqlSessionFactory sqlSessionFactory = null;  
    
    static {  
        try {  
            InputStream is = Resources.getResourceAsStream("config/mybatis-config.xml");  
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
          
    }  
      
    public static SqlSessionFactory getSqlSessionFactory() {  
        return sqlSessionFactory;  
    }  
}

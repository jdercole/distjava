
package edu.week.dj.week9.data;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class ConnectionUtil {
    
    public static Connection getConnection() throws Exception {
        Context initContext = new InitialContext();
	Context webContext = (Context) initContext.lookup("java:comp/env");
	DataSource ds = (DataSource) webContext.lookup("jdbc/yarnDataSource");
	return ds.getConnection();
    }
    
}

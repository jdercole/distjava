
package edu.week.dj.week9.data;

import edu.wctc.dj.week9.model.Yarn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class YarnDAO {
    
    public List<Yarn> getYarn() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM YARN");
            rs = stmt.executeQuery();
            
            List<Yarn> yarnList = new ArrayList<>();
            while(rs.next()) {
                String yarnid = rs.getString("yarnid");
                String name = rs.getString("name");
                double skeinLength = rs.getDouble("skeinLength");
                String color = rs.getString("color");
                double price = rs.getDouble("price");
                
                Yarn yarn = new Yarn(yarnid, name, skeinLength, color, price);
                yarnList.add(yarn);
                
            }
            
            return yarnList;
            
        } finally {
            if(rs!=null) rs.close();
            if(stmt!=null) stmt.close();
            if(conn!=null) conn.close();
        }
               
    }
}

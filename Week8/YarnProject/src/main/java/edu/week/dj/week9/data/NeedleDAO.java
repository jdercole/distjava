
package edu.week.dj.week9.data;

import edu.wctc.dj.week9.model.Needle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class NeedleDAO {
    
    public List<Needle> getNeedles() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM NEEDLES");
            rs = stmt.executeQuery();
            
            List<Needle> needleList = new ArrayList<>();
            while(rs.next()) {
                String needleid = rs.getString("needleid");
                String needleType = rs.getObject("needleType", NeedleType);
                String material = rs.getString("material");
                double size = rs.getDouble("size");
                
                Needle needle = new Needle(needleid, needleType, material, size);
                needleList.add(needle);
                
            }
            return needleList;
        } finally {
            if(rs!=null) rs.close();
            if(stmt!=null) stmt.close();
            if(conn!=null) conn.close();
        }
               
    }
}

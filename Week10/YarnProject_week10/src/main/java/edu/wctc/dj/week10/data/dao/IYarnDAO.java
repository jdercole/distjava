
package edu.wctc.dj.week10.data.dao;

import edu.wctc.dj.week10.model.Yarn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IYarnDAO extends JpaRepository<Yarn, String> {
    
}

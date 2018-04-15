
package edu.wctc.dj.week10.data.dao;

import edu.wctc.dj.week10.model.Needle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INeedleDAO extends JpaRepository<Needle, String> {
    
}

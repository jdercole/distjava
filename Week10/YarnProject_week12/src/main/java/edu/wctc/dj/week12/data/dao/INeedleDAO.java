
package edu.wctc.dj.week12.data.dao;

import edu.wctc.dj.week12.model.Needle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INeedleDAO extends JpaRepository<Needle, String> {
    
}

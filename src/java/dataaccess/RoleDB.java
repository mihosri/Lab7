package dataaccess;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import models.Role;
/**
 *
 * @author Alex Tompkins - 821984
 */
public class RoleDB {
    public List<Role> getAll() throws Exception 
    {
        List<Role> roles = new ArrayList<>();
        
       EntityManagerFactory emFactory = DBUtil.getEmFactory();
        
        EntityManager em = emFactory.createEntityManager();
        
        try {
            roles.addAll(em.createNamedQuery("Role.findAll", Role.class).getResultList());
        } finally {
            em.close();
        }
        return roles;
    }
}

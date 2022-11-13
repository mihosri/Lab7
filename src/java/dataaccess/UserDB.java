package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import models.*;

/**
 *
 * @author Alex Tompkins - 821984
 */
public class UserDB 
{

    public List<User> getAll() throws Exception 
    {
        
        EntityManagerFactory emfactory = DBUtil.getEmFactory();
        
        EntityManager em = emfactory.createEntityManager();
        
        List<User> users;
        try
        {
           users = em.createNamedQuery("User.findAll", User.class).getResultList();
        }
        catch(Exception ex)
        {
            em.close();
            return null;
        }
        
        return users;
      
    }

    public User get(String email) throws Exception 
    {
        EntityManagerFactory emfactory = DBUtil.getEmFactory();
        
        EntityManager em = emfactory.createEntityManager();
        
        User user;
           
        try
        {
           user = em.find(User.class, email);
        }
        catch(Exception ex)
        {
            em.close();
            return null;
        }
        
        return user;
    }

    public void insert(User user) throws Exception 
    {
        EntityManagerFactory emfactory = DBUtil.getEmFactory();
        
        EntityManager em = emfactory.createEntityManager();
        
        EntityTransaction transac = em.getTransaction();
        
        try
        {
            transac.begin();
            em.persist(user);
            transac.commit();
        }
        catch (Exception ex) 
        {
            transac.rollback();
        }
        finally 
        {
            em.close();
        }     
    }

    public void update(User user) throws Exception 
    {
        EntityManagerFactory emfactory = DBUtil.getEmFactory();
        
        EntityManager em = emfactory.createEntityManager();
        
        EntityTransaction transac = em.getTransaction();
        
        try
        {
            transac.begin();
            em.persist(user);
            transac.commit();
        }
        catch (Exception ex) 
        {
            transac.rollback();
        }
        finally 
        {
            em.close();
        }     
    }

    public void delete(User user) throws Exception 
    {
        EntityManagerFactory emfactory = DBUtil.getEmFactory();
        
        EntityManager em = emfactory.createEntityManager();
        
        EntityTransaction transac = em.getTransaction();
        
        try
        {
            transac.begin();
            em.persist(user);
            transac.commit();
        }
        catch (Exception ex) 
        {
            transac.rollback();
        }
        finally 
        {
            em.close();
        }     
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 808735
 */

@Entity
@Table(name = "role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT u FROM Role u")
    , @NamedQuery(name = "Role.findById", query = "SELECT u FROM Role u WHERE u.id = :id")
    , @NamedQuery(name = "Role.findByName", query = "SELECT u FROM Role u WHERE u.name = :name")})
public class Role implements Serializable{
    @Id
    @Column(name = "role_id")
    private int id;
 
    @Column(name = "role_name")
    private String name;

    public Role() {
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

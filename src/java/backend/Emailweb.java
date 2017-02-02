/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AlexP
 */
@Entity
@Table(name = "emailweb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emailweb.findAll", query = "SELECT e FROM Emailweb e"),
    @NamedQuery(name = "Emailweb.findById", query = "SELECT e FROM Emailweb e WHERE e.id = :id"),
    @NamedQuery(name = "Emailweb.findByNev", query = "SELECT e FROM Emailweb e WHERE e.nev = :nev"),
    @NamedQuery(name = "Emailweb.findByCikkCim", query = "SELECT e FROM Emailweb e WHERE e.cikkCim = :cikkCim"),
    @NamedQuery(name = "Emailweb.findByDatum", query = "SELECT e FROM Emailweb e WHERE e.datum = :datum")})
public class Emailweb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nev")
    private String nev;
    @Basic(optional = false)
    @Column(name = "cikk cim")
    private String cikkCim;
    @Basic(optional = false)
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;

    public Emailweb() {
    }

    public Emailweb(Integer id) {
        this.id = id;
    }

    public Emailweb(Integer id, String nev, String cikkCim, Date datum) {
        this.id = id;
        this.nev = nev;
        this.cikkCim = cikkCim;
        this.datum = datum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getCikkCim() {
        return cikkCim;
    }

    public void setCikkCim(String cikkCim) {
        this.cikkCim = cikkCim;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emailweb)) {
            return false;
        }
        Emailweb other = (Emailweb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "backend.Emailweb[ id=" + id + " ]";
    }
    
}

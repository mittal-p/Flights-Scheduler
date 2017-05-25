/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shubham
 */
@Entity
@Table(name = "SCHEDULEDFLIGHTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Scheduledflights.findAll", query = "SELECT s FROM Scheduledflights s"),
    @NamedQuery(name = "Scheduledflights.findByDay", query = "SELECT s FROM Scheduledflights s WHERE s.day = :day"),
    @NamedQuery(name = "Scheduledflights.findBySourcecity", query = "SELECT s FROM Scheduledflights s WHERE s.sourcecity = :sourcecity"),
    @NamedQuery(name = "Scheduledflights.findByDestination", query = "SELECT s FROM Scheduledflights s WHERE s.destination = :destination"),
    @NamedQuery(name = "Scheduledflights.findByArrivaltime", query = "SELECT s FROM Scheduledflights s WHERE s.arrivaltime = :arrivaltime"),
    @NamedQuery(name = "Scheduledflights.findByDeparturetime", query = "SELECT s FROM Scheduledflights s WHERE s.departuretime = :departuretime"),
    @NamedQuery(name = "Scheduledflights.findById", query = "SELECT s FROM Scheduledflights s WHERE s.id = :id")})
public class Scheduledflights implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "DAY")
    private String day;
    @Size(max = 30)
    @Column(name = "SOURCECITY")
    private String sourcecity;
    @Size(max = 20)
    @Column(name = "DESTINATION")
    private String destination;
    @Size(max = 20)
    @Column(name = "ARRIVALTIME")
    private String arrivaltime;
    @Size(max = 20)
    @Column(name = "DEPARTURETIME")
    private String departuretime;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;

    public Scheduledflights() {
    }

    public Scheduledflights(String id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSourcecity() {
        return sourcecity;
    }

    public void setSourcecity(String sourcecity) {
        this.sourcecity = sourcecity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(object instanceof Scheduledflights)) {
            return false;
        }
        Scheduledflights other = (Scheduledflights) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Scheduledflights[ id=" + id + " ]";
    }
    
}

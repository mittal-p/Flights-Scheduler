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
@Table(name = "FLIGHTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Flights.findAll", query = "SELECT f FROM Flights f"),
    @NamedQuery(name = "Flights.findBySourcecity", query = "SELECT f FROM Flights f WHERE f.sourcecity = :sourcecity"),
    @NamedQuery(name = "Flights.findByDestinationcity", query = "SELECT f FROM Flights f WHERE f.destinationcity = :destinationcity"),
    @NamedQuery(name = "Flights.findByNumFlights", query = "SELECT f FROM Flights f WHERE f.numFlights = :numFlights"),
    @NamedQuery(name = "Flights.findByDuration", query = "SELECT f FROM Flights f WHERE f.duration = :duration"),
    @NamedQuery(name = "Flights.findByFid", query = "SELECT f FROM Flights f WHERE f.fid = :fid")})
public class Flights implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 30)
    @Column(name = "SOURCECITY")
    private String sourcecity;
    @Size(max = 30)
    @Column(name = "DESTINATIONCITY")
    private String destinationcity;
    @Column(name = "NUM_FLIGHTS")
    private Integer numFlights;
    @Column(name = "DURATION")
    private Integer duration;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "FID")
    private String fid;

    public Flights() {
    }

    public Flights(String fid) {
        this.fid = fid;
    }

    public String getSourcecity() {
        return sourcecity;
    }

    public void setSourcecity(String sourcecity) {
        this.sourcecity = sourcecity;
    }

    public String getDestinationcity() {
        return destinationcity;
    }

    public void setDestinationcity(String destinationcity) {
        this.destinationcity = destinationcity;
    }

    public Integer getNumFlights() {
        return numFlights;
    }

    public void setNumFlights(Integer numFlights) {
        this.numFlights = numFlights;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flights)) {
            return false;
        }
        Flights other = (Flights) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Flights[ fid=" + fid + " ]";
    }
    
}

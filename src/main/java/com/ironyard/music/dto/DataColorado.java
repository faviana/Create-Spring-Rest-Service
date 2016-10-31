package com.ironyard.music.dto;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

/**
 * Created by favianalopez on 10/26/16.
 */
public class DataColorado {

    private String entityname;
    private long entityid;
    private String agentfirstname;
    private String entitystatus;
    private String agentprincipalcountry;
    private String agentprincipaladdress1;
    private String entitytypeverbatim;
    private String principalcountry;
    private String agentprincipalstate;
    private String agentprincipalcity;
    private String principaladdress1;
    private String agentlastname;
    private Date principalcity;
    private BaseCalendar.Date entityformdate;
    private String agentprincipalzipcode;
    private String principalstate;
    private String entitytype;
    private String principalzipcode;
    LocationInfo Location;

    public String getEntityname() {
        return entityname;
    }

    public void setEntityname(String entityname) {
        this.entityname = entityname;
    }

    public long getEntityid() {
        return entityid;
    }

    public void setEntityid(long entityid) {
        this.entityid = entityid;
    }

    public String getAgentfirstname() {
        return agentfirstname;
    }

    public void setAgentfirstname(String agentfirstname) {
        this.agentfirstname = agentfirstname;
    }

    public String getEntitystatus() {
        return entitystatus;
    }

    public void setEntitystatus(String entitystatus) {
        this.entitystatus = entitystatus;
    }

    public String getAgentprincipalcountry() {
        return agentprincipalcountry;
    }

    public void setAgentprincipalcountry(String agentprincipalcountry) {
        this.agentprincipalcountry = agentprincipalcountry;
    }

    public String getAgentprincipaladdress1() {
        return agentprincipaladdress1;
    }

    public void setAgentprincipaladdress1(String agentprincipaladdress1) {
        this.agentprincipaladdress1 = agentprincipaladdress1;
    }

    public String getEntitytypeverbatim() {
        return entitytypeverbatim;
    }

    public void setEntitytypeverbatim(String entitytypeverbatim) {
        this.entitytypeverbatim = entitytypeverbatim;
    }

    public String getPrincipalcountry() {
        return principalcountry;
    }

    public void setPrincipalcountry(String principalcountry) {
        this.principalcountry = principalcountry;
    }

    public String getAgentprincipalstate() {
        return agentprincipalstate;
    }

    public void setAgentprincipalstate(String agentprincipalstate) {
        this.agentprincipalstate = agentprincipalstate;
    }

    public String getAgentprincipalcity() {
        return agentprincipalcity;
    }

    public void setAgentprincipalcity(String agentprincipalcity) {
        this.agentprincipalcity = agentprincipalcity;
    }

    public String getPrincipaladdress1() {
        return principaladdress1;
    }

    public void setPrincipaladdress1(String principaladdress1) {
        this.principaladdress1 = principaladdress1;
    }

    public String getAgentlastname() {
        return agentlastname;
    }

    public void setAgentlastname(String agentlastname) {
        this.agentlastname = agentlastname;
    }

    public Date getPrincipalcity() {
        return principalcity;
    }

    public void setPrincipalcity(Date principalcity) {
        this.principalcity = principalcity;
    }

    public BaseCalendar.Date getEntityformdate() {
        return entityformdate;
    }

    public void setEntityformdate(BaseCalendar.Date entityformdate) {
        this.entityformdate = entityformdate;
    }

    public String getAgentprincipalzipcode() {
        return agentprincipalzipcode;
    }

    public void setAgentprincipalzipcode(String agentprincipalzipcode) {
        this.agentprincipalzipcode = agentprincipalzipcode;
    }

    public String getPrincipalstate() {
        return principalstate;
    }

    public void setPrincipalstate(String principalstate) {
        this.principalstate = principalstate;
    }

    public String getEntitytype() {
        return entitytype;
    }

    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype;
    }

    public String getPrincipalzipcode() {
        return principalzipcode;
    }

    public void setPrincipalzipcode(String principalzipcode) {
        this.principalzipcode = principalzipcode;
    }

    public LocationInfo getLocation() {
        return Location;
    }

    public void setLocation(LocationInfo location) {
        Location = location;
    }
}

package com.zkzy.portal.base.admin.api.entity;

import java.io.Serializable;

public class SystemIp implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_IP.IP
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_IP.LOCATION
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_IP.RECENT_OPERATOR
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    private String recentOperator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_IP.OPERATING_TIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    private String operatingTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_IP.STARTTIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    private String starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_IP.ENDTIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    private String endtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_IP.IP
     *
     * @return the value of SYSTEM_IP.IP
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    private String status;
    private String lng;
    private String lat;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_IP.IP
     *
     * @param ip the value for SYSTEM_IP.IP
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_IP.LOCATION
     *
     * @return the value of SYSTEM_IP.LOCATION
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_IP.LOCATION
     *
     * @param location the value for SYSTEM_IP.LOCATION
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_IP.RECENT_OPERATOR
     *
     * @return the value of SYSTEM_IP.RECENT_OPERATOR
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public String getRecentOperator() {
        return recentOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_IP.RECENT_OPERATOR
     *
     * @param recentOperator the value for SYSTEM_IP.RECENT_OPERATOR
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public void setRecentOperator(String recentOperator) {
        this.recentOperator = recentOperator == null ? null : recentOperator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_IP.OPERATING_TIME
     *
     * @return the value of SYSTEM_IP.OPERATING_TIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public String getOperatingTime() {
        return operatingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_IP.OPERATING_TIME
     *
     * @param operatingTime the value for SYSTEM_IP.OPERATING_TIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public void setOperatingTime(String operatingTime) {
        this.operatingTime = operatingTime == null ? null : operatingTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_IP.STARTTIME
     *
     * @return the value of SYSTEM_IP.STARTTIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_IP.STARTTIME
     *
     * @param starttime the value for SYSTEM_IP.STARTTIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_IP.ENDTIME
     *
     * @return the value of SYSTEM_IP.ENDTIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_IP.ENDTIME
     *
     * @param endtime the value for SYSTEM_IP.ENDTIME
     *
     * @mbggenerated Fri Jul 07 09:58:52 CST 2017
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
package com.easyway.website.cshx.model.po;

import org.apache.ibatis.type.Alias;

import com.easyway.website.cshx.common.BaseObject;

@Alias("coachinfo")
public class CoachInfoPo extends BaseObject {

	private static final long serialVersionUID = -8896764182047327865L;

	private String traveldate;
	private String schedulecode;
	private String stopstationname;
	private String arrstationname;
	private String deptime;
	private String vehiclelevel;
	private String peoplenum;
	private String kil;
	private String duration;
	private String remainseatnum;
	private String remainchildnum;
	private String exeprice;
	private String halfprice;
	private String boardlocation;
	private String checkinno;
	private String gettime;
	
	public String getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(String traveldate) {
		this.traveldate = traveldate;
	}
	public String getSchedulecode() {
		return schedulecode;
	}
	public void setSchedulecode(String schedulecode) {
		this.schedulecode = schedulecode;
	}
	public String getStopstationname() {
		return stopstationname;
	}
	public void setStopstationname(String stopstationname) {
		this.stopstationname = stopstationname;
	}
	public String getArrstationname() {
		return arrstationname;
	}
	public void setArrstationname(String arrstationname) {
		this.arrstationname = arrstationname;
	}
	public String getDeptime() {
		return deptime;
	}
	public void setDeptime(String deptime) {
		this.deptime = deptime;
	}
	public String getVehiclelevel() {
		return vehiclelevel;
	}
	public void setVehiclelevel(String vehiclelevel) {
		this.vehiclelevel = vehiclelevel;
	}
	public String getPeoplenum() {
		return peoplenum;
	}
	public void setPeoplenum(String peoplenum) {
		this.peoplenum = peoplenum;
	}
	public String getKil() {
		return kil;
	}
	public void setKil(String kil) {
		this.kil = kil;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getRemainseatnum() {
		return remainseatnum;
	}
	public void setRemainseatnum(String remainseatnum) {
		this.remainseatnum = remainseatnum;
	}
	public String getRemainchildnum() {
		return remainchildnum;
	}
	public void setRemainchildnum(String remainchildnum) {
		this.remainchildnum = remainchildnum;
	}
	public String getExeprice() {
		return exeprice;
	}
	public void setExeprice(String exeprice) {
		this.exeprice = exeprice;
	}
	public String getHalfprice() {
		return halfprice;
	}
	public void setHalfprice(String halfprice) {
		this.halfprice = halfprice;
	}
	public String getBoardlocation() {
		return boardlocation;
	}
	public void setBoardlocation(String boardlocation) {
		this.boardlocation = boardlocation;
	}
	public String getCheckinno() {
		return checkinno;
	}
	public void setCheckinno(String checkinno) {
		this.checkinno = checkinno;
	}
	public String getGettime() {
		return gettime;
	}
	public void setGettime(String gettime) {
		this.gettime = gettime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

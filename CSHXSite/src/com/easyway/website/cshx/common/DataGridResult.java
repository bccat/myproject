package com.easyway.website.cshx.common;

import java.util.List;

public class DataGridResult<E> extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7023147859509838386L;

	private int total;
	private List<E> rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<E> getRows() {
		return rows;
	}
	public void setRows(List<E> rows) {
		this.rows = rows;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

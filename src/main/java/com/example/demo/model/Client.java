package com.example.demo.model;

public class Client {

	private int cid;
	private String cname;
	private String caddr;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	@Override
	public String toString() {
		return "Client [cid=" + cid + ", cname=" + cname + ", caddr=" + caddr + "]";
	}

}

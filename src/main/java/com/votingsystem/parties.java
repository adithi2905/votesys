package com.votingsystem;

public class parties {
	int ucount;
	int bcount;
	int acount;
	public parties(String party)
	{
		if(party.equals("UPA"))
			ucount+=1;
			else if(party.equals("BJP"))
				bcount+=1;
			else
				acount+=1;
			
	}
	public int getUcount() {
	return ucount;}
	public int getBcount() {
	return bcount;}
	public int getAcount() {
	return acount;}



}

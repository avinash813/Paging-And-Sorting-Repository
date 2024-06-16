package com.sample.service;

import java.util.List;

import com.sample.Entity.VaccineInfo;

public interface VaccineManagement {
	
	public Iterable<VaccineInfo> fetchDetails(boolean status, String... properties);
	public List<VaccineInfo> fetchDetailsByPgNo(int pgNo, int pgSize, boolean status, String... properties);
	public void fetchDetailsByPgSize(int pgSize);
	
	

}

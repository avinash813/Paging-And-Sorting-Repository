package com.sample.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sample.Entity.VaccineInfo;

public interface Repository extends PagingAndSortingRepository<VaccineInfo, Integer> {

	
}

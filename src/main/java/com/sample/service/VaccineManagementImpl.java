package com.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.Entity.VaccineInfo;
import com.sample.dao.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
@Service
public class VaccineManagementImpl implements VaccineManagement {
	
	@Autowired
	Repository repo;

	@Override
	public Iterable<VaccineInfo> fetchDetails(boolean status, String... properties) {
		Sort sort = Sort.by(status ? Direction.ASC : Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public List<VaccineInfo> fetchDetailsByPgNo(int pgNo, int pgSize, boolean status, String... properties) {
		PageRequest pageable = PageRequest.of(pgNo, pgSize, status ? Direction.ASC : Direction.DESC, properties);
		Page<VaccineInfo> page = repo.findAll(pageable);
		List<VaccineInfo> vaccinePage = page.getContent();
		return vaccinePage;
		
	}

	@Override
	public void fetchDetailsByPgSize(int pgSize) {
		Integer count = 5;
		Integer pgCount = count/pgSize;
		pgCount = count%pgSize ==0 ? pgCount : ++pgCount;
		
		for(int i = 0; i<pgCount; i++) {
			PageRequest pg = PageRequest.of(i,pgSize);
			Page<VaccineInfo> page = repo.findAll(pg);
			page.getContent().forEach((c) -> System.out.println(c));
			
			System.out.println("Total Pages are: "+ page.getTotalPages());
			
		}
		
		
	}
	
	


}

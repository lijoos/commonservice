package com.LJ.Spring.commonService.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LJ.Spring.commonService.Model.CovidDetail;


public interface CovidDataRepository extends MongoRepository<CovidDetail,Integer>{
	
	List<CovidDetail>  findTop1ByOrderByLastUpdatedDesc();
}

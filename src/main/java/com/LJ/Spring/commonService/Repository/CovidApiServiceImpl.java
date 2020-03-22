package com.LJ.Spring.commonService.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.LJ.Spring.commonService.Dto.CovidDetail;
import com.LJ.Spring.commonService.ServiceImpl.CovidApiService;

@Service
public class CovidApiServiceImpl  implements CovidApiService{

	final String uri = "https://www.bing.com/covid/data?IG=A2CB748E6608421FAA5AAEE6EDD82B50";

    @Autowired
    RestTemplate restTemplate;
	@Override
	public CovidDetail getCovidData() {
	    CovidDetail result = restTemplate.getForObject(uri, CovidDetail.class);
		return result;
	}
	

}

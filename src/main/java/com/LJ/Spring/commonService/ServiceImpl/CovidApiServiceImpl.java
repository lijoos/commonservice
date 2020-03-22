package com.LJ.Spring.commonService.ServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.LJ.Spring.commonService.Model.CovidDetail;
import com.LJ.Spring.commonService.Model.User;
import com.LJ.Spring.commonService.Repository.CovidDataRepository;
import com.LJ.Spring.commonService.Repository.UserRepository;
import com.LJ.Spring.commonService.Service.CovidApiService;


@Service
public class CovidApiServiceImpl  implements CovidApiService{

	final String uri = "https://www.bing.com/covid/data?IG=A2CB748E6608421FAA5AAEE6EDD82B50";

    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    CovidDataRepository covidDataRepository;
    
    @Autowired
    UserRepository userRepository;
	@Override
	public CovidDetail getCovidData() {
		 CovidDetail covidDetail =new CovidDetail();
		 covidDetail = restTemplate.getForObject(uri, CovidDetail.class);
		 covidDetail.setId(processDate(covidDetail.getLastUpdated()+"-"+covidDetail.getTotalConfirmed()));
		 covidDataRepository.save(covidDetail);
		 
		List<CovidDetail> ff= covidDataRepository.findTop1ByOrderByLastUpdatedDesc();
		return ff.get(0);
	}
	
	String processDate(String dateString){
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date   date       = format.parse ( dateString);
			dateString = format.format( date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return dateString;
	}
	

}

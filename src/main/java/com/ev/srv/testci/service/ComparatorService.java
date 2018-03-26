package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.FinancialHealth;
import com.ev.srv.testci.model.RequestWrapperWorld;
import com.ev.srv.testci.model.UserWorld;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ComparatorController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface ComparatorService {


 	/**
 	 * Expenses on each category in a concrete month.
 	 * 
     * @return
     */
    String getCategoryGroupedVsWorld(Long acuerdoBE,List<Long> subacuerdo,String month,Integer ageInterval,Integer incomeInterval,String postalCode,String gender,String categories)  throws ApiException;    

 	/**
 	 * Compute the financial freedom of a person.
 	 * 
     * @return
     */
    FinancialHealth getFinancialFreedom(Long acuerdoBE,List<Long> subacuerdo,Double balance,Double income)  throws ApiException;    

 	/**
 	 * Expenses on each month
 	 * 
     * @return
     */
    String getMonthlyGroupedVsWorld(Long acuerdoBE,List<Long> subacuerdo,String fromMonth,String toMonth,Integer ageInterval,Integer incomeInterval,String postalCode,String gender,String categories)  throws ApiException;    

 	/**
 	 * Return the world for the given user.
 	 * 
     * @return
     */
    UserWorld getUserWorld(Long acuerdoBE,List<Long> subacuerdo)  throws ApiException;    

 	/**
 	 * Codify the data.
 	 * 
     * @return
     */
    String saveWorld(RequestWrapperWorld body)  throws ApiException;    
}

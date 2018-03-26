package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.ComparatorService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.FinancialHealth;
import com.ev.srv.testci.model.RequestWrapperWorld;
import com.ev.srv.testci.model.UserWorld;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link ComparatorController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class ComparatorServiceImpl implements ComparatorService{

    @Override
    public String getCategoryGroupedVsWorld(Long acuerdoBE,List<Long> subacuerdo,String month,Integer ageInterval,Integer incomeInterval,String postalCode,String gender,String categories) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public FinancialHealth getFinancialFreedom(Long acuerdoBE,List<Long> subacuerdo,Double balance,Double income) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public String getMonthlyGroupedVsWorld(Long acuerdoBE,List<Long> subacuerdo,String fromMonth,String toMonth,Integer ageInterval,Integer incomeInterval,String postalCode,String gender,String categories) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public UserWorld getUserWorld(Long acuerdoBE,List<Long> subacuerdo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public String saveWorld(RequestWrapperWorld body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

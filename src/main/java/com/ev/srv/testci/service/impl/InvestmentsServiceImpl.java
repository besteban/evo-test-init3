package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.InvestmentsService;
import com.evo.api.springboot.exception.ApiException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link InvestmentsController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class InvestmentsServiceImpl implements InvestmentsService{

    @Override
    public String getInvestmentsGlobalPosition(String acuerdoBE) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

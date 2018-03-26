package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.PingService;
import com.evo.api.springboot.exception.ApiException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link PingController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class PingServiceImpl implements PingService{

    @Override
    public String ping() throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

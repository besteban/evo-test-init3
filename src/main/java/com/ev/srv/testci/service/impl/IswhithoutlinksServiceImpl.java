package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.IswhithoutlinksService;
import com.evo.api.springboot.exception.ApiException;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link IswhithoutlinksController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class IswhithoutlinksServiceImpl implements IswhithoutlinksService{

    @Override
    public Map<String, Boolean> isWithoutLinksAccount(String acuerdoBE,String subacuerdo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

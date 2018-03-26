package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.VoiceService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.PhoneActionObject;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link VoiceController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class VoiceServiceImpl implements VoiceService{

    @Override
    public PhoneActionObject interpreter(String acuerdoBE,String text,List<String> subacuerdo,String subacuerdotarjeta,String language,String categoryId,String internaltransfer,Integer maxItems) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

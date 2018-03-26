package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.PhoneActionObject;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link VoiceController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface VoiceService {


 	/**
 	 * This is the voice filter.
 	 * 
     * @return
     */
    PhoneActionObject interpreter(String acuerdoBE,String text,List<String> subacuerdo,String subacuerdotarjeta,String language,String categoryId,String internaltransfer,Integer maxItems)  throws ApiException;    
}

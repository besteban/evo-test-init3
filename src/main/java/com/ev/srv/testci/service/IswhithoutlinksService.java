package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import java.util.Map;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link IswhithoutlinksController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface IswhithoutlinksService {


 	/**
 	 * Return if a account is without links type.
 	 * 
     * @return
     */
    Map<String, Boolean> isWithoutLinksAccount(String acuerdoBE,String subacuerdo)  throws ApiException;    
}

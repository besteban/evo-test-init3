package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link StatusController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface StatusService {


 	/**
 	 * Check whether if the data base is responding correctly.
 	 * 
     * @return
     */
    String status()  throws ApiException;    
}

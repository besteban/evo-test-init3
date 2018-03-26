package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProfileController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface ProfileService {


 	/**
 	 * Return the stored favourites for the given user.
 	 * 
     * @return
     */
    String deletePushes(String acuerdoBE,String uuid)  throws ApiException;    

 	/**
 	 * Return the stored favourites for the given user.
 	 * 
     * @return
     */
    String getPushes(String acuerdoBE)  throws ApiException;    
}

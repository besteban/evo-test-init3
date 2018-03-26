package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.GeneralProperties;
import java.util.Map;
import com.ev.srv.testci.model.RequestWrapperGeneralProperties;
import com.ev.srv.testci.model.RequestWrapperInbox;
import com.ev.srv.testci.model.RequestWrapperMapStringString;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PropertiesController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface PropertiesService {


 	/**
 	 * Delete an inbox of the user.
 	 * 
     * @return
     */
    String deleteInbox(String inbox,String codigoEntidad,String usuarioBE,String acuerdoBE)  throws ApiException;    

 	/**
 	 * Delete a property of the user.
 	 * 
     * @return
     */
    String deleteProperty(String property,String codigoEntidad,String usuarioBE,String acuerdoBE)  throws ApiException;    

 	/**
 	 * Return the requested property.
 	 * 
     * @return
     */
    Map<String, Map<String> getProfile(String codigoEntidad,String usuarioBE,String othersAssociatedEB)  throws ApiException;    

 	/**
 	 * Return the user properties.
 	 * 
     * @return
     */
    GeneralProperties getProperties(String codigoEntidad,String usuarioBE,String acuerdoBE)  throws ApiException;    

 	/**
 	 * Create a new inbox.
 	 * 
     * @return
     */
    GeneralProperties newInbox(RequestWrapperInbox body)  throws ApiException;    

 	/**
 	 * Create a property of the user if it doesn?t exists or modify it if it does.
 	 * 
     * @return
     */
    GeneralProperties newProperty(RequestWrapperMapStringString body)  throws ApiException;    

 	/**
 	 * Modify properties of the user.
 	 * 
     * @return
     */
    GeneralProperties updateProperties(RequestWrapperGeneralProperties body)  throws ApiException;    
}

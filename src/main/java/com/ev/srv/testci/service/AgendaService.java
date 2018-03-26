package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.Contact;
import com.ev.srv.testci.model.RequestWrapperContact;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link AgendaController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface AgendaService {


 	/**
 	 * Delete a contact from the agenda.
 	 * 
     * @return
     */
    String deleteContact(String uuid,String acuerdoBE)  throws ApiException;    

 	/**
 	 * Return a contact from the agenda of the user.
 	 * 
     * @return
     */
    List<Contact> getContactByText(String acuerdoBE,String userName)  throws ApiException;    

 	/**
 	 * Add a new contact to the user agenda.
 	 * 
     * @return
     */
    Contact newContact(RequestWrapperContact body)  throws ApiException;    

 	/**
 	 * Modify contact from the agenda.
 	 * 
     * @return
     */
    Contact updateContact(RequestWrapperContact body)  throws ApiException;    
}

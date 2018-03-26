package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.AgendaService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.Contact;
import com.ev.srv.testci.model.RequestWrapperContact;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link AgendaController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class AgendaServiceImpl implements AgendaService{

    @Override
    public String deleteContact(String uuid,String acuerdoBE) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<Contact> getContactByText(String acuerdoBE,String userName) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public Contact newContact(RequestWrapperContact body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public Contact updateContact(RequestWrapperContact body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

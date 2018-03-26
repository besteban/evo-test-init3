package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.PropertiesService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.GeneralProperties;
import java.util.Map;
import com.ev.srv.testci.model.RequestWrapperGeneralProperties;
import com.ev.srv.testci.model.RequestWrapperInbox;
import com.ev.srv.testci.model.RequestWrapperMapStringString;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link PropertiesController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class PropertiesServiceImpl implements PropertiesService{

    @Override
    public String deleteInbox(String inbox,String codigoEntidad,String usuarioBE,String acuerdoBE) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public String deleteProperty(String property,String codigoEntidad,String usuarioBE,String acuerdoBE) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public Map<String, Map<String> getProfile(String codigoEntidad,String usuarioBE,String othersAssociatedEB) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public GeneralProperties getProperties(String codigoEntidad,String usuarioBE,String acuerdoBE) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public GeneralProperties newInbox(RequestWrapperInbox body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public GeneralProperties newProperty(RequestWrapperMapStringString body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public GeneralProperties updateProperties(RequestWrapperGeneralProperties body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

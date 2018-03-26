package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.FavouriteService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.FavouriteTransfer;
import com.ev.srv.testci.model.RequestWrapperFavouriteTransfer;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link FavouriteController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class FavouriteServiceImpl implements FavouriteService{

    @Override
    public String deleteFavourite(String uuid,String codigoEntidad,String usuarioBE,String acuerdoBE) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<FavouriteTransfer> getFavourites(String codigoEntidad,String usuarioBE,String acuerdoBE) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public FavouriteTransfer newFavourite(RequestWrapperFavouriteTransfer body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public FavouriteTransfer updateFavourite(RequestWrapperFavouriteTransfer body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

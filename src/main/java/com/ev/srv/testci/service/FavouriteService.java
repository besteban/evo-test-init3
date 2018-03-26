package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.FavouriteTransfer;
import com.ev.srv.testci.model.RequestWrapperFavouriteTransfer;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link FavouriteController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface FavouriteService {


 	/**
 	 * Delete a favourite transfer of the user
 	 * 
     * @return
     */
    String deleteFavourite(String uuid,String codigoEntidad,String usuarioBE,String acuerdoBE)  throws ApiException;    

 	/**
 	 * Return the stored favourites for the given user.
 	 * 
     * @return
     */
    List<FavouriteTransfer> getFavourites(String codigoEntidad,String usuarioBE,String acuerdoBE)  throws ApiException;    

 	/**
 	 * Add a new favourite transfer to the data base.
 	 * 
     * @return
     */
    FavouriteTransfer newFavourite(RequestWrapperFavouriteTransfer body)  throws ApiException;    

 	/**
 	 * Modify an already stored favourite transfer of the user
 	 * 
     * @return
     */
    FavouriteTransfer updateFavourite(RequestWrapperFavouriteTransfer body)  throws ApiException;    
}

package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.CardMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedAggregationCardMovement;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperCardMovement;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CardmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface CardmovementService {


 	/**
 	 * Filtering out the card movements. Results are aggregated in its response.
 	 * 
     * @return
     */
    PagedAggregationCardMovement cardFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String cardContract,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text)  throws ApiException;    

 	/**
 	 * List aggregated card movements by category associated with the subContract and filter conditions.
 	 * 
     * @return
     */
    List<ExpensesDetail> getListOfAllCardMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String cardContract,OffsetDateTime desde,OffsetDateTime hasta,String tipo)  throws ApiException;    

 	/**
 	 * List all card movements associated with the account id and filter conditions. You can get ingress, egress or both
 	 * 
     * @return
     */
    PagedEvoMovement getListOfAllCardMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String cardContract,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size)  throws ApiException;    

 	/**
 	 * This service allows to change multiple fields for a given card movement.
 	 * 
     * @return
     */
    CardMovement updateCardMovement(RequestWrapperCardMovement body)  throws ApiException;    
}

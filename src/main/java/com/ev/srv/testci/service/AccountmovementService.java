package com.ev.srv.testci.service;

import com.ev.srv.testci.model.AggregationEvoMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link AccountmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface AccountmovementService {


 	/**
 	 * Filter the account movements with wide range of options. Results are aggregated in its response.
 	 * 
     * @return
     */
    AggregationEvoMovement accountFilter(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer operationType,String category,Double fromAmount,Double toAmount,Integer maxItems,String text,String filter)  throws ApiException;    

 	/**
 	 * Aggregate account movements by category associated with the subContract and filter conditions.
 	 * 
     * @return
     */
    List<ExpensesDetail> getListOfAllAccountMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo)  throws ApiException;    

 	/**
 	 * List all account movements associated with the subContract and filter conditions.
 	 * 
     * @return
     */
    PagedEvoMovement getListOfAllAccountMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size)  throws ApiException;    

 	/**
 	 * List expenses associated with the subcontract id and filter conditions.
 	 * 
     * @return
     */
    AggregationEvoMovement getListOfAllExpenseAccountMovementAggregated(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta)  throws ApiException;    

 	/**
 	 * This service allows to change multiple fields for a given account movement.
 	 * 
     * @return
     */
    EvoMovement updateAccountMovement(RequestWrapperBaseModel body)  throws ApiException;    
}

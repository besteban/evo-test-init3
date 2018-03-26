package com.ev.srv.testci.service;

import com.ev.srv.testci.model.AggregationEvoMovement;
import com.ev.srv.testci.model.AggregationWrapper;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link MovementsController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface MovementsService {


 	/**
 	 * Filter the account movements with wide range of options. Results are aggregated in its response.
 	 * 
     * @return
     */
    AggregationEvoMovement accountFilter(String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer operationType,String category,Double fromAmount,Double toAmount,Integer maxItems,String text)  throws ApiException;    

 	/**
 	 * Getting pending movements of the account.
 	 * 
     * @return
     */
    AggregationEvoMovement getMovement(String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta)  throws ApiException;    

 	/**
 	 * Getting movements of the state of a client.
 	 * 
     * @return
     */
    AggregationEvoMovement getMovement(String acuerdoBE,List<String> subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Boolean isCreditOperation,Integer page,Integer size,String categories,String operationsign)  throws ApiException;    

 	/**
 	 * Getting aggregations for movements of the state of the client.
 	 * 
     * @return
     */
    AggregationWrapper getMovementAggregation(String acuerdoBE,List<String> subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String aggregatorType,Integer operationType,String tipo,Boolean isCreditOperation,Integer page,Integer size)  throws ApiException;    

 	/**
 	 * Return all kind of movements based on the filter.
 	 * 
     * @return
     */
    AggregationEvoMovement movementfilter(String acuerdoBE,String filter)  throws ApiException;    

 	/**
 	 * This is for updating any kind of movement.
 	 * 
     * @return
     */
    EvoMovement updateMovement(RequestWrapperBaseModel body)  throws ApiException;    
}

package com.ev.srv.testci.service;

import com.ev.srv.testci.model.AggregationPaymentModel;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import com.ev.srv.testci.model.RequestWrapperPaymentModel;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PaymentmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface PaymentmovementService {


 	/**
 	 * This service allows to create a manual payment. Every single field is editable: categoryId, loadedAmount and frequency.
 	 * 
     * @return
     */
    List<EvoMovement> createManualPaymentMovement(RequestWrapperPaymentModel body)  throws ApiException;    

 	/**
 	 * List grouped payment movements by category associated with the subContract and filter conditions.
 	 * 
     * @return
     */
    List<ExpensesDetail> getListOfAllPaymentMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo)  throws ApiException;    

 	/**
 	 * List all payment movements associated with the subContract and filter conditions.
 	 * 
     * @return
     */
    PagedEvoMovement getListOfAllPaymentMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size)  throws ApiException;    

 	/**
 	 * Filter the payment movements with wide range of options. Results are aggregated in its response.
 	 * 
     * @return
     */
    AggregationPaymentModel paymentFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,Integer maxItems,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,String text)  throws ApiException;    

 	/**
 	 * This services allows to delete a given payment (manual or forecasted). Deletions of real payments are not allowed.
 	 * 
     * @return
     */
    String removePaymentMovement(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,String uuid,Boolean deleteAll)  throws ApiException;    

 	/**
 	 * This service allows to edit a given payment. Depending on the payment type (paymentType) different fields can be edited.
 	 * 
     * @return
     */
    List<EvoMovement> updatePaymentMovement(RequestWrapperBaseModel body)  throws ApiException;    
}

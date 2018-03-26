package com.ev.srv.testci.service;

import com.ev.srv.testci.model.AggregationBillMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.BillMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBillMovement;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link BillmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface BillmovementService {


 	/**
 	 * This is the filter for returning bill movements.
 	 * 
     * @return
     */
    AggregationBillMovement billFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text)  throws ApiException;    

 	/**
 	 * List bills grouped by category associated with the account id and filter conditions. You can get ingress, egress or both
 	 * 
     * @return
     */
    List<ExpensesDetail> getListOfAllBillMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo)  throws ApiException;    

 	/**
 	 * List all bills associated with the account id and filter conditions. You can get ingress, egress or both
 	 * 
     * @return
     */
    PagedEvoMovement getListOfAllBillMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,List<String> billPaymentId,String tipo,Integer page,Integer size)  throws ApiException;    

 	/**
 	 * This accountValidationServiceI allows to edit a given bill.
 	 * 
     * @return
     */
    BillMovement updateBillMovement(RequestWrapperBillMovement body)  throws ApiException;    
}

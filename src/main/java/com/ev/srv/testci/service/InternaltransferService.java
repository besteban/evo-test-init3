package com.ev.srv.testci.service;

import com.ev.srv.testci.model.AggregationInternalTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ExpensesDetail;
import com.ev.srv.testci.model.InternalTransferMovement;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperInternalTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link InternaltransferController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface InternaltransferService {


 	/**
 	 * List all internal transfers associated with the account id and filter conditions. You can get ingress, egress or both
 	 * 
     * @return
     */
    PagedEvoMovement getListOfAllInternalTransferMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size)  throws ApiException;    

 	/**
 	 * List internal transfers grouped by category associated with the account id and filter conditions. You can get ingress, egress or both.
 	 * 
     * @return
     */
    List<ExpensesDetail> getListOfAllInternalTransferMovementsAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo)  throws ApiException;    

 	/**
 	 * This is the filter service for internal transfers. Results are aggregated in its response.
 	 * 
     * @return
     */
    AggregationInternalTransferMovement internalTransferFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text)  throws ApiException;    

 	/**
 	 * This service allows to edit a given internal transfer.
 	 * 
     * @return
     */
    InternalTransferMovement updateInternationalTransferMovement(RequestWrapperInternalTransferMovement body)  throws ApiException;    
}

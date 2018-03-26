package com.ev.srv.testci.service;

import com.ev.srv.testci.model.AggregationWireTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperWireTransferMovement;
import com.ev.srv.testci.model.StringFile;
import com.ev.srv.testci.model.WireTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link WiretransfermovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface WiretransfermovementService {


 	/**
 	 * List all wire transfers associated with the account id and filter conditions. You can get ingress, egress or both
 	 * 
     * @return
     */
    PagedEvoMovement getListOfAllWireTransferMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size)  throws ApiException;    

 	/**
 	 * List wire transfers grouped by category associated with the account id and filter conditions. You can get ingress, egress or both
 	 * 
     * @return
     */
    List<ExpensesDetail> getListOfAllWireTransfersMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo)  throws ApiException;    

 	/**
 	 * Get pdf for a wire transfer
 	 * 
     * @return
     */
    StringFile getWireTransferMovementPDF(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,String uuid)  throws ApiException;    

 	/**
 	 * This service allows to change the multiple fields for a given account movement.
 	 * 
     * @return
     */
    WireTransferMovement updateWireTransferMovement(RequestWrapperWireTransferMovement body)  throws ApiException;    

 	/**
 	 * This is the filter accountValidationServiceI. Results are aggregated in its response.
 	 * 
     * @return
     */
    AggregationWireTransferMovement wireTransferFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text)  throws ApiException;    
}

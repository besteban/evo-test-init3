package com.ev.srv.testci.service;

import com.ev.srv.testci.model.AggregationEvoMovement;
import com.ev.srv.testci.model.AggregationForecastModel;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ForecastModel;
import com.ev.srv.testci.model.GraphPoint;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.RequestWrapperForecastModel;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ForecastmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface ForecastmovementService {


 	/**
 	 * This service allows to create a forecast manually.
 	 * 
     * @return
     */
    List<ForecastModel> createManualForecastMovement(RequestWrapperForecastModel body)  throws ApiException;    

 	/**
 	 * Deletes modifications on the forecast.
 	 * 
     * @return
     */
    String deleteUpdatedForecast(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,String uuid)  throws ApiException;    

 	/**
 	 * List of movements related with forecast associated with the category specified.
 	 * 
     * @return
     */
    AggregationEvoMovement getForecastRelatedMovements(String categoryid,String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,Integer page,Integer maxItems)  throws ApiException;    

 	/**
 	 * List of forecasted incomes and expenses associated with the subcontract id and filter conditions.
 	 * 
     * @return
     */
    AggregationForecastModel getForecastedIncomesExpensesAggregated(String acuerdoBE,String subacuerdo,String tipo,String categories)  throws ApiException;    

 	/**
 	 * Comparison of multiple months for a given category between predictions and reality.
 	 * 
     * @return
     */
    List<GraphPoint> getForecastedIncomesExpensesMultiple(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime from,OffsetDateTime to,String type,String categoryId)  throws ApiException;    

 	/**
 	 * This service allows to change multiple fields for a given forecast.
 	 * 
     * @return
     */
    ForecastModel updateForecastMovement(RequestWrapperForecastModel body)  throws ApiException;    
}

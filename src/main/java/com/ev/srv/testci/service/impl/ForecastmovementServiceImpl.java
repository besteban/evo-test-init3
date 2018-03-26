package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.ForecastmovementService;
import com.ev.srv.testci.model.AggregationEvoMovement;
import com.ev.srv.testci.model.AggregationForecastModel;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ForecastModel;
import com.ev.srv.testci.model.GraphPoint;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.RequestWrapperForecastModel;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link ForecastmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class ForecastmovementServiceImpl implements ForecastmovementService{

    @Override
    public List<ForecastModel> createManualForecastMovement(RequestWrapperForecastModel body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public String deleteUpdatedForecast(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,String uuid) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationEvoMovement getForecastRelatedMovements(String categoryid,String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,Integer page,Integer maxItems) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationForecastModel getForecastedIncomesExpensesAggregated(String acuerdoBE,String subacuerdo,String tipo,String categories) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<GraphPoint> getForecastedIncomesExpensesMultiple(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime from,OffsetDateTime to,String type,String categoryId) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public ForecastModel updateForecastMovement(RequestWrapperForecastModel body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.MovementsService;
import com.ev.srv.testci.model.AggregationEvoMovement;
import com.ev.srv.testci.model.AggregationWrapper;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link MovementsController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class MovementsServiceImpl implements MovementsService{

    @Override
    public AggregationEvoMovement accountFilter(String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer operationType,String category,Double fromAmount,Double toAmount,Integer maxItems,String text) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationEvoMovement getMovement(String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationEvoMovement getMovement(String acuerdoBE,List<String> subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Boolean isCreditOperation,Integer page,Integer size,String categories,String operationsign) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationWrapper getMovementAggregation(String acuerdoBE,List<String> subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String aggregatorType,Integer operationType,String tipo,Boolean isCreditOperation,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationEvoMovement movementfilter(String acuerdoBE,String filter) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public EvoMovement updateMovement(RequestWrapperBaseModel body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

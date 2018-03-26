package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.AccountmovementService;
import com.ev.srv.testci.model.AggregationEvoMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link AccountmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class AccountmovementServiceImpl implements AccountmovementService{

    @Override
    public AggregationEvoMovement accountFilter(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer operationType,String category,Double fromAmount,Double toAmount,Integer maxItems,String text,String filter) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<ExpensesDetail> getListOfAllAccountMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public PagedEvoMovement getListOfAllAccountMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationEvoMovement getListOfAllExpenseAccountMovementAggregated(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public EvoMovement updateAccountMovement(RequestWrapperBaseModel body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

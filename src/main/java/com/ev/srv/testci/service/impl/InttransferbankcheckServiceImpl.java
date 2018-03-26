package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.InttransferbankcheckService;
import com.ev.srv.testci.model.AggregationIntTransferBankCheckMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ExpensesDetail;
import com.ev.srv.testci.model.IntTransferBankCheckMovement;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperIntTransferBankCheckMovement;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link InttransferbankcheckController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class InttransferbankcheckServiceImpl implements InttransferbankcheckService{

    @Override
    public PagedEvoMovement getListOfAllIntTransferBankCheckMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<ExpensesDetail> getListOfAllIntTransfersBankCheckMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationIntTransferBankCheckMovement intTransferBankCheckFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public IntTransferBankCheckMovement updateIntTransferBankCheckMovement(RequestWrapperIntTransferBankCheckMovement body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

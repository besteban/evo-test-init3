package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.InternaltransferService;
import com.ev.srv.testci.model.AggregationInternalTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ExpensesDetail;
import com.ev.srv.testci.model.InternalTransferMovement;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperInternalTransferMovement;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link InternaltransferController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class InternaltransferServiceImpl implements InternaltransferService{

    @Override
    public PagedEvoMovement getListOfAllInternalTransferMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<ExpensesDetail> getListOfAllInternalTransferMovementsAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationInternalTransferMovement internalTransferFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public InternalTransferMovement updateInternationalTransferMovement(RequestWrapperInternalTransferMovement body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

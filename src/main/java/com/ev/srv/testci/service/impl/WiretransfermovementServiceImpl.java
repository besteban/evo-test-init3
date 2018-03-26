package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.WiretransfermovementService;
import com.ev.srv.testci.model.AggregationWireTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperWireTransferMovement;
import com.ev.srv.testci.model.StringFile;
import com.ev.srv.testci.model.WireTransferMovement;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link WiretransfermovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class WiretransfermovementServiceImpl implements WiretransfermovementService{

    @Override
    public PagedEvoMovement getListOfAllWireTransferMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<ExpensesDetail> getListOfAllWireTransfersMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public StringFile getWireTransferMovementPDF(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,String uuid) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public WireTransferMovement updateWireTransferMovement(RequestWrapperWireTransferMovement body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationWireTransferMovement wireTransferFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

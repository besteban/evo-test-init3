package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.BillmovementService;
import com.ev.srv.testci.model.AggregationBillMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.BillMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBillMovement;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link BillmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class BillmovementServiceImpl implements BillmovementService{

    @Override
    public AggregationBillMovement billFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<ExpensesDetail> getListOfAllBillMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public PagedEvoMovement getListOfAllBillMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,List<String> billPaymentId,String tipo,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public BillMovement updateBillMovement(RequestWrapperBillMovement body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

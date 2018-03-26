package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.CardmovementService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.CardMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedAggregationCardMovement;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperCardMovement;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link CardmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class CardmovementServiceImpl implements CardmovementService{

    @Override
    public PagedAggregationCardMovement cardFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String cardContract,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,Integer maxItems,String text) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<ExpensesDetail> getListOfAllCardMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String cardContract,OffsetDateTime desde,OffsetDateTime hasta,String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public PagedEvoMovement getListOfAllCardMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String cardContract,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public CardMovement updateCardMovement(RequestWrapperCardMovement body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

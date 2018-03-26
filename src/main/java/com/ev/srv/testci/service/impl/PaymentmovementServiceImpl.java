package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.PaymentmovementService;
import com.ev.srv.testci.model.AggregationPaymentModel;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import com.ev.srv.testci.model.RequestWrapperPaymentModel;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link PaymentmovementController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class PaymentmovementServiceImpl implements PaymentmovementService{

    @Override
    public List<EvoMovement> createManualPaymentMovement(RequestWrapperPaymentModel body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<ExpensesDetail> getListOfAllPaymentMovementAggregatedByCategory(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public PagedEvoMovement getListOfAllPaymentMovements(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,OffsetDateTime desde,OffsetDateTime hasta,String tipo,Integer page,Integer size) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public AggregationPaymentModel paymentFinder(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,Integer maxItems,OffsetDateTime desde,OffsetDateTime hasta,String tipo,String category,Double fromAmount,Double toAmount,String text) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public String removePaymentMovement(String codigoEntidad,String usuarioBE,String acuerdoBE,String subacuerdo,String uuid,Boolean deleteAll) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public List<EvoMovement> updatePaymentMovement(RequestWrapperBaseModel body) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

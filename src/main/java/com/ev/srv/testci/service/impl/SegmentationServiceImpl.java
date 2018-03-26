package com.ev.srv.testci.service.impl;

import com.ev.srv.testci.service.SegmentationService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.Segmentation;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link SegmentationController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class SegmentationServiceImpl implements SegmentationService{

    @Override
    public List<Segmentation> getMonthlySegmentation(String codigoEntidad,String usuarioBE,String acuerdoBE,String associatedAccountId) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}

package com.ev.srv.testci.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.Segmentation;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link SegmentationController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface SegmentationService {


 	/**
 	 * Score for the last three closed months.
 	 * 
     * @return
     */
    List<Segmentation> getMonthlySegmentation(String codigoEntidad,String usuarioBE,String acuerdoBE,String associatedAccountId)  throws ApiException;    
}

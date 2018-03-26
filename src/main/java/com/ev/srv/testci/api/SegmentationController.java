package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.Segmentation;
import com.ev.srv.testci.service.SegmentationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;
import com.evo.api.springboot.exception.ApiException;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class SegmentationController {

	@Autowired
    private SegmentationService service;

	@ApiOperation(value = "Score for the last three closed months.", nickname = "getMonthlySegmentation", notes = "", response = Segmentation.class, responseContainer = "List", tags={ "segmentation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Segmentation.class, responseContainer = "List") })
    @RequestMapping(value = "/segmentation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<Segmentation>> getMonthlySegmentation( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Account where the score is assigned.", required = true)  @RequestParam(value = "associatedAccountId", required = true) String associatedAccountId) throws ApiException{
        return new ResponseEntity<List<Segmentation>>(service.getMonthlySegmentation(codigoEntidad, usuarioBE, acuerdoBE, associatedAccountId), HttpStatus.NOT_IMPLEMENTED);
    }

}

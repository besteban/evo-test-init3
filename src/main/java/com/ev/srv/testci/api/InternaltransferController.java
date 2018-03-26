package com.ev.srv.testci.api;

import com.ev.srv.testci.model.AggregationInternalTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ExpensesDetail;
import com.ev.srv.testci.model.InternalTransferMovement;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperInternalTransferMovement;
import com.ev.srv.testci.service.InternaltransferService;

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
public class InternaltransferController {

	@Autowired
    private InternaltransferService service;

	@ApiOperation(value = "List all internal transfers associated with the account id and filter conditions. You can get ingress, egress or both", nickname = "getListOfAllInternalTransferMovements", notes = "", response = PagedEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PagedEvoMovement.class) })
    @RequestMapping(value = "/internaltransfer/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PagedEvoMovement> getListOfAllInternalTransferMovements( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size.")  @RequestParam(value = "size", required = false) Integer size) throws ApiException{
        return new ResponseEntity<PagedEvoMovement>(service.getListOfAllInternalTransferMovements(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, page, size), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List internal transfers grouped by category associated with the account id and filter conditions. You can get ingress, egress or both.", nickname = "getListOfAllInternalTransferMovementsAggregatedByCategory", notes = "", response = ExpensesDetail.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExpensesDetail.class, responseContainer = "List") })
    @RequestMapping(value = "/internaltransfer/aggregated",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<ExpensesDetail>> getListOfAllInternalTransferMovementsAggregatedByCategory( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements.")  @RequestParam(value = "tipo", required = false) String tipo) throws ApiException{
        return new ResponseEntity<List<ExpensesDetail>>(service.getListOfAllInternalTransferMovementsAggregatedByCategory(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This is the filter service for internal transfers. Results are aggregated in its response.", nickname = "internalTransferFinder", notes = "", response = AggregationInternalTransferMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationInternalTransferMovement.class) })
    @RequestMapping(value = "/internaltransfer/filter",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationInternalTransferMovement> internalTransferFinder( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Category id")  @RequestParam(value = "category", required = false) String category, @ApiParam(value = "Minimum amount.")  @RequestParam(value = "fromAmount", required = false) Double fromAmount, @ApiParam(value = "Maximum amount.")  @RequestParam(value = "toAmount", required = false) Double toAmount, @ApiParam(value = "Number of items to retrieve.")  @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "Text to be searched in the movement description.")  @RequestParam(value = "text", required = false) String text) throws ApiException{
        return new ResponseEntity<AggregationInternalTransferMovement>(service.internalTransferFinder(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, category, fromAmount, toAmount, maxItems, text), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This service allows to edit a given internal transfer.", nickname = "updateInternationalTransferMovement", notes = "", response = InternalTransferMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InternalTransferMovement.class) })
    @RequestMapping(value = "/internaltransfer/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<InternalTransferMovement> updateInternationalTransferMovement(@ApiParam(value = "Json representing the internal transfer object" ,required=true )  @RequestBody RequestWrapperInternalTransferMovement body) throws ApiException{
        return new ResponseEntity<InternalTransferMovement>(service.updateInternationalTransferMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

}

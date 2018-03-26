package com.ev.srv.testci.api;

import com.ev.srv.testci.model.AggregationBillMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.BillMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBillMovement;
import com.ev.srv.testci.service.BillmovementService;

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
public class BillmovementController {

	@Autowired
    private BillmovementService service;

	@ApiOperation(value = "This is the filter for returning bill movements.", nickname = "billFinder", notes = "", response = AggregationBillMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationBillMovement.class) })
    @RequestMapping(value = "/billmovement/filter",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationBillMovement> billFinder( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Category")  @RequestParam(value = "category", required = false) String category, @ApiParam(value = "Minimum amount.")  @RequestParam(value = "fromAmount", required = false) Double fromAmount, @ApiParam(value = "Maximum amount.")  @RequestParam(value = "toAmount", required = false) Double toAmount, @ApiParam(value = "Number of items to retrieve (maximum of 50)")  @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "Text to search in the movement description")  @RequestParam(value = "text", required = false) String text) throws ApiException{
        return new ResponseEntity<AggregationBillMovement>(service.billFinder(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, category, fromAmount, toAmount, maxItems, text), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List bills grouped by category associated with the account id and filter conditions. You can get ingress, egress or both", nickname = "getListOfAllBillMovementAggregatedByCategory", notes = "", response = ExpensesDetail.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExpensesDetail.class, responseContainer = "List") })
    @RequestMapping(value = "/billmovement/aggregated",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<ExpensesDetail>> getListOfAllBillMovementAggregatedByCategory( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo) throws ApiException{
        return new ResponseEntity<List<ExpensesDetail>>(service.getListOfAllBillMovementAggregatedByCategory(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List all bills associated with the account id and filter conditions. You can get ingress, egress or both", nickname = "getListOfAllBillMovements", notes = "", response = PagedEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PagedEvoMovement.class) })
    @RequestMapping(value = "/billmovement/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PagedEvoMovement> getListOfAllBillMovements( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "Filter by ssociated contract number of the bill")  @RequestParam(value = "billPaymentId", required = false) List<String> billPaymentId, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size.")  @RequestParam(value = "size", required = false) Integer size) throws ApiException{
        return new ResponseEntity<PagedEvoMovement>(service.getListOfAllBillMovements(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, billPaymentId, tipo, page, size), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This accountValidationServiceI allows to edit a given bill.", nickname = "updateBillMovement", notes = "", response = BillMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BillMovement.class) })
    @RequestMapping(value = "/billmovement/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<BillMovement> updateBillMovement(@ApiParam(value = "Json representing the bill movement object" ,required=true )  @RequestBody RequestWrapperBillMovement body) throws ApiException{
        return new ResponseEntity<BillMovement>(service.updateBillMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

}

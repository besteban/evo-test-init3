package com.ev.srv.testci.api;

import com.ev.srv.testci.model.AggregationEvoMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import com.ev.srv.testci.service.AccountmovementService;

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
public class AccountmovementController {

	@Autowired
    private AccountmovementService service;

	@ApiOperation(value = "Filter the account movements with wide range of options. Results are aggregated in its response.", nickname = "accountFilter", notes = "", response = AggregationEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationEvoMovement.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/accountmovement/filter",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationEvoMovement> accountFilter( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Number indicating the type of movements to withdraw.")  @RequestParam(value = "operationType", required = false) Integer operationType, @ApiParam(value = "Category")  @RequestParam(value = "category", required = false) String category, @ApiParam(value = "Minimum amount")  @RequestParam(value = "fromAmount", required = false) Double fromAmount, @ApiParam(value = "Maximum amount")  @RequestParam(value = "toAmount", required = false) Double toAmount, @ApiParam(value = "Number of items retrieved.")  @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "Text to search in movements description.")  @RequestParam(value = "text", required = false) String text, @ApiParam(value = "Filter string object returned by another service.")  @RequestParam(value = "filter", required = false) String filter) throws ApiException{
        return new ResponseEntity<AggregationEvoMovement>(service.accountFilter(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, operationType, category, fromAmount, toAmount, maxItems, text, filter), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Aggregate account movements by category associated with the subContract and filter conditions.", nickname = "getListOfAllAccountMovementAggregatedByCategory", notes = "", response = ExpensesDetail.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExpensesDetail.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/accountmovement/aggregated",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<ExpensesDetail>> getListOfAllAccountMovementAggregatedByCategory( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo) throws ApiException{
        return new ResponseEntity<List<ExpensesDetail>>(service.getListOfAllAccountMovementAggregatedByCategory(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List all account movements associated with the subContract and filter conditions.", nickname = "getListOfAllAccountMovements", notes = "", response = PagedEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PagedEvoMovement.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/accountmovement/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PagedEvoMovement> getListOfAllAccountMovements( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size.")  @RequestParam(value = "size", required = false) Integer size) throws ApiException{
        return new ResponseEntity<PagedEvoMovement>(service.getListOfAllAccountMovements(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, page, size), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List expenses associated with the subcontract id and filter conditions.", nickname = "getListOfAllExpenseAccountMovementAggregated", notes = "", response = AggregationEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationEvoMovement.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/accountmovement/expenses",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationEvoMovement> getListOfAllExpenseAccountMovementAggregated( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta) throws ApiException{
        return new ResponseEntity<AggregationEvoMovement>(service.getListOfAllExpenseAccountMovementAggregated(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This service allows to change multiple fields for a given account movement.", nickname = "updateAccountMovement", notes = "", response = EvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EvoMovement.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/accountmovement/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<EvoMovement> updateAccountMovement(@ApiParam(value = "Json representing the movement object" ,required=true )  @RequestBody RequestWrapperBaseModel body) throws ApiException{
        return new ResponseEntity<EvoMovement>(service.updateAccountMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

}

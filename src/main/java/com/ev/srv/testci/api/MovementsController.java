package com.ev.srv.testci.api;

import com.ev.srv.testci.model.AggregationEvoMovement;
import com.ev.srv.testci.model.AggregationWrapper;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import com.ev.srv.testci.service.MovementsService;

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
public class MovementsController {

	@Autowired
    private MovementsService service;

	@ApiOperation(value = "Filter the account movements with wide range of options. Results are aggregated in its response.", nickname = "accountFilter", notes = "", response = AggregationEvoMovement.class, tags={ "movements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationEvoMovement.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/movements/filter",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationEvoMovement> accountFilter( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Number indicating the type of movements to withdraw.")  @RequestParam(value = "operationType", required = false) Integer operationType, @ApiParam(value = "Categories comma separated")  @RequestParam(value = "category", required = false) String category, @ApiParam(value = "Minimum amount")  @RequestParam(value = "fromAmount", required = false) Double fromAmount, @ApiParam(value = "Maximum amount")  @RequestParam(value = "toAmount", required = false) Double toAmount, @ApiParam(value = "Number of items retrieved.")  @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "Text to search in movements description.")  @RequestParam(value = "text", required = false) String text) throws ApiException{
        return new ResponseEntity<AggregationEvoMovement>(service.accountFilter(acuerdoBE, subacuerdo, desde, hasta, tipo, operationType, category, fromAmount, toAmount, maxItems, text), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Getting pending movements of the account.", nickname = "getMovement", notes = "", response = AggregationEvoMovement.class, tags={ "movements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationEvoMovement.class) })
    @RequestMapping(value = "/movements/pending",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationEvoMovement> getMovement( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta) throws ApiException{
        return new ResponseEntity<AggregationEvoMovement>(service.getMovement(acuerdoBE, subacuerdo, desde, hasta), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Getting movements of the state of a client.", nickname = "getMovement", notes = "", response = AggregationEvoMovement.class, tags={ "movements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationEvoMovement.class) })
    @RequestMapping(value = "/movements/state",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationEvoMovement> getMovement( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontracts", required = true)  @RequestParam(value = "subacuerdo", required = true) List<String> subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Retrieve all credit or debit operations")  @RequestParam(value = "isCreditOperation", required = false) Boolean isCreditOperation, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size.")  @RequestParam(value = "size", required = false) Integer size, @ApiParam(value = "Filter by categories")  @RequestParam(value = "categories", required = false) String categories, @ApiParam(value = "Filter by income/expense")  @RequestParam(value = "operationsign", required = false) String operationsign) throws ApiException{
        return new ResponseEntity<AggregationEvoMovement>(service.getMovement(acuerdoBE, subacuerdo, desde, hasta, tipo, isCreditOperation, page, size, categories, operationsign), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Getting aggregations for movements of the state of the client.", nickname = "getMovementAggregation", notes = "", response = AggregationWrapper.class, tags={ "movements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationWrapper.class) })
    @RequestMapping(value = "/movements/aggregation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationWrapper> getMovementAggregation( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontracts", required = true)  @RequestParam(value = "subacuerdo", required = true) List<String> subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "Type of aggregator that will be applied", required = true)  @RequestParam(value = "aggregatorType", required = true) String aggregatorType, @ApiParam(value = "Number indicating the type of movements to withdraw.")  @RequestParam(value = "operationType", required = false) Integer operationType, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Retrieve all credit or debit operations")  @RequestParam(value = "isCreditOperation", required = false) Boolean isCreditOperation, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size.")  @RequestParam(value = "size", required = false) Integer size) throws ApiException{
        return new ResponseEntity<AggregationWrapper>(service.getMovementAggregation(acuerdoBE, subacuerdo, desde, hasta, aggregatorType, operationType, tipo, isCreditOperation, page, size), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Return all kind of movements based on the filter.", nickname = "movementfilter", notes = "", response = AggregationEvoMovement.class, tags={ "movements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationEvoMovement.class) })
    @RequestMapping(value = "/movements",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationEvoMovement> movementfilter( @ApiParam(value = "acuerdoBE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Filter string object returned by another service.", required = true)  @RequestParam(value = "filter", required = true) String filter) throws ApiException{
        return new ResponseEntity<AggregationEvoMovement>(service.movementfilter(acuerdoBE, filter), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This is for updating any kind of movement.", nickname = "updateMovement", notes = "", response = EvoMovement.class, tags={ "movements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EvoMovement.class) })
    @RequestMapping(value = "/movements",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<EvoMovement> updateMovement(@ApiParam(value = "Json representing any movement object." ,required=true )  @RequestBody RequestWrapperBaseModel body) throws ApiException{
        return new ResponseEntity<EvoMovement>(service.updateMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

}

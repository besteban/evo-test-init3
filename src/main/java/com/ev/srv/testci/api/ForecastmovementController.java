package com.ev.srv.testci.api;

import com.ev.srv.testci.model.AggregationEvoMovement;
import com.ev.srv.testci.model.AggregationForecastModel;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ForecastModel;
import com.ev.srv.testci.model.GraphPoint;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.RequestWrapperForecastModel;
import com.ev.srv.testci.service.ForecastmovementService;

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
public class ForecastmovementController {

	@Autowired
    private ForecastmovementService service;

	@ApiOperation(value = "This service allows to create a forecast manually.", nickname = "createManualForecastMovement", notes = "", response = ForecastModel.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ForecastModel.class, responseContainer = "List") })
    @RequestMapping(value = "/forecastmovement/new",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<List<ForecastModel>> createManualForecastMovement(@ApiParam(value = "Json representing the forecast object" ,required=true )  @RequestBody RequestWrapperForecastModel body) throws ApiException{
        return new ResponseEntity<List<ForecastModel>>(service.createManualForecastMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Deletes modifications on the forecast.", nickname = "deleteUpdatedForecast", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/forecastmovement/deleteupdated",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)

    public ResponseEntity<String> deleteUpdatedForecast( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "Uuid of the forecast", required = true)  @RequestParam(value = "uuid", required = true) String uuid) throws ApiException{
        return new ResponseEntity<String>(service.deleteUpdatedForecast(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, uuid), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List of movements related with forecast associated with the category specified.", nickname = "getForecastRelatedMovements", notes = "", response = AggregationEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationEvoMovement.class) })
    @RequestMapping(value = "/forecastmovement/{categoryid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationEvoMovement> getForecastRelatedMovements( @ApiParam(value = "",required=true) @PathVariable("categoryid") String categoryid, @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Number of items per page.")  @RequestParam(value = "maxItems", required = false) Integer maxItems) throws ApiException{
        return new ResponseEntity<AggregationEvoMovement>(service.getForecastRelatedMovements(categoryid, codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, page, maxItems), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List of forecasted incomes and expenses associated with the subcontract id and filter conditions.", nickname = "getForecastedIncomesExpensesAggregated", notes = "", response = AggregationForecastModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationForecastModel.class) })
    @RequestMapping(value = "/forecastmovement/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationForecastModel> getForecastedIncomesExpensesAggregated( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Filter categorias")  @RequestParam(value = "categories", required = false) String categories) throws ApiException{
        return new ResponseEntity<AggregationForecastModel>(service.getForecastedIncomesExpensesAggregated(acuerdoBE, subacuerdo, tipo, categories), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Comparison of multiple months for a given category between predictions and reality.", nickname = "getForecastedIncomesExpensesMultiple", notes = "", response = GraphPoint.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GraphPoint.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created") })
    @RequestMapping(value = "/forecastmovement/graph",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<GraphPoint>> getForecastedIncomesExpensesMultiple( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "from", required = false) OffsetDateTime from, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "to", required = false) OffsetDateTime to, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "type", required = false) String type, @ApiParam(value = "Category id")  @RequestParam(value = "categoryId", required = false) String categoryId) throws ApiException{
        return new ResponseEntity<List<GraphPoint>>(service.getForecastedIncomesExpensesMultiple(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, from, to, type, categoryId), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This service allows to change multiple fields for a given forecast.", nickname = "updateForecastMovement", notes = "", response = ForecastModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ForecastModel.class) })
    @RequestMapping(value = "/forecastmovement/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<ForecastModel> updateForecastMovement(@ApiParam(value = "Json representing the forecast movement object" ,required=true )  @RequestBody RequestWrapperForecastModel body) throws ApiException{
        return new ResponseEntity<ForecastModel>(service.updateForecastMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

}

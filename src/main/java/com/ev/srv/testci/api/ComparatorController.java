package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.FinancialHealth;
import com.ev.srv.testci.model.RequestWrapperWorld;
import com.ev.srv.testci.model.UserWorld;
import com.ev.srv.testci.service.ComparatorService;

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
public class ComparatorController {

	@Autowired
    private ComparatorService service;

	@ApiOperation(value = "Expenses on each category in a concrete month.", nickname = "getCategoryGroupedVsWorld", notes = "", response = String.class, tags={ "comparator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/comparator/categories",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<String> getCategoryGroupedVsWorld( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) Long acuerdoBE, @ApiParam(value = "List of subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) List<Long> subacuerdo, @ApiParam(value = "Month to get data from", required = true)  @RequestParam(value = "month", required = true) String month, @ApiParam(value = "Age interval", required = true)  @RequestParam(value = "ageInterval", required = true) Integer ageInterval, @ApiParam(value = "Income", required = true)  @RequestParam(value = "incomeInterval", required = true) Integer incomeInterval, @ApiParam(value = "Geographic grouper for the world. The most segregated value is postal code..", required = true)  @RequestParam(value = "postalCode", required = true) String postalCode, @ApiParam(value = "Gender of the world", required = true)  @RequestParam(value = "gender", required = true) String gender, @ApiParam(value = "Filter by categories")  @RequestParam(value = "categories", required = false) String categories) throws ApiException{
        return new ResponseEntity<String>(service.getCategoryGroupedVsWorld(acuerdoBE, subacuerdo, month, ageInterval, incomeInterval, postalCode, gender, categories), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Compute the financial freedom of a person.", nickname = "getFinancialFreedom", notes = "", response = FinancialHealth.class, tags={ "comparator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FinancialHealth.class) })
    @RequestMapping(value = "/comparator/financialHealth",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<FinancialHealth> getFinancialFreedom( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) Long acuerdoBE, @ApiParam(value = "List of subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) List<Long> subacuerdo, @ApiParam(value = "Balance for given accounts.", required = true)  @RequestParam(value = "balance", required = true) Double balance, @ApiParam(value = "Income to compute metrics.")  @RequestParam(value = "income", required = false) Double income) throws ApiException{
        return new ResponseEntity<FinancialHealth>(service.getFinancialFreedom(acuerdoBE, subacuerdo, balance, income), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Expenses on each month", nickname = "getMonthlyGroupedVsWorld", notes = "", response = String.class, tags={ "comparator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/comparator/monthly",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<String> getMonthlyGroupedVsWorld( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) Long acuerdoBE, @ApiParam(value = "List of subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) List<Long> subacuerdo, @ApiParam(value = "Start month to retrieve (yyyyMM)", required = true)  @RequestParam(value = "fromMonth", required = true) String fromMonth, @ApiParam(value = "Last month to retrieve (yyyyMM)", required = true)  @RequestParam(value = "toMonth", required = true) String toMonth, @ApiParam(value = "Age interval", required = true)  @RequestParam(value = "ageInterval", required = true) Integer ageInterval, @ApiParam(value = "Income", required = true)  @RequestParam(value = "incomeInterval", required = true) Integer incomeInterval, @ApiParam(value = "Geographic grouper for the world. The most segregated value is postal code.", required = true)  @RequestParam(value = "postalCode", required = true) String postalCode, @ApiParam(value = "Gender of the world", required = true)  @RequestParam(value = "gender", required = true) String gender, @ApiParam(value = "Filter by categories")  @RequestParam(value = "categories", required = false) String categories) throws ApiException{
        return new ResponseEntity<String>(service.getMonthlyGroupedVsWorld(acuerdoBE, subacuerdo, fromMonth, toMonth, ageInterval, incomeInterval, postalCode, gender, categories), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Return the world for the given user.", nickname = "getUserWorld", notes = "", response = UserWorld.class, tags={ "comparator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserWorld.class) })
    @RequestMapping(value = "/comparator/world",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<UserWorld> getUserWorld( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) Long acuerdoBE, @ApiParam(value = "List of subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) List<Long> subacuerdo) throws ApiException{
        return new ResponseEntity<UserWorld>(service.getUserWorld(acuerdoBE, subacuerdo), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Codify the data.", nickname = "saveWorld", notes = "", response = String.class, tags={ "comparator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/comparator/checkworld",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<String> saveWorld(@ApiParam(value = "Json representing the world feedback." ,required=true )  @RequestBody RequestWrapperWorld body) throws ApiException{
        return new ResponseEntity<String>(service.saveWorld(body), HttpStatus.NOT_IMPLEMENTED);
    }

}

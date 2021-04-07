/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-07T05:48:22.248Z")

@Validated
@Api(value = "readme", description = "the readme API")
@RequestMapping(value = "/cliente-api/v1")
public interface ReadmeApi {

    @ApiOperation(value = "Recupera readme da API.", nickname = "readme", notes = "Esta operação retorna o readme da API.", tags={ "API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso ao recuperar readme da API."),
        @ApiResponse(code = 500, message = "Erro interno ao tentar realizar recuperar o readme da API.") })
    @RequestMapping(value = "/readme",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> readme();

}
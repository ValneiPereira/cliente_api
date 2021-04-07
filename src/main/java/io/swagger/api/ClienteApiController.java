package io.swagger.api;

import io.swagger.model.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-07T05:48:22.248Z")

@Controller
public class ClienteApiController implements ClienteApi {

    private static final Logger log = LoggerFactory.getLogger(ClienteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ClienteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Cliente> alteraStatusPorId(@ApiParam(value = "Status do cliente.",required=true, allowableValues = "\"ativo\", \"inativo\"") @PathVariable("status") String status,@ApiParam(value = "Id do cliente.",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cliente>(objectMapper.readValue("{  \"tipo\" : \"interno\",  \"dataAtualizacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}", Cliente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cliente> alterarCliente(@ApiParam(value = "Id do cliente.",required=true) @PathVariable("id") Integer id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Cliente cliente) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cliente>(objectMapper.readValue("{  \"tipo\" : \"interno\",  \"dataAtualizacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}", Cliente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cliente> cadastrarNovo(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Cliente cliente) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cliente>(objectMapper.readValue("{  \"tipo\" : \"interno\",  \"dataAtualizacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}", Cliente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cliente> consultarPorId(@ApiParam(value = "Id do cliente.",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cliente>(objectMapper.readValue("{  \"tipo\" : \"interno\",  \"dataAtualizacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}", Cliente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cliente> consultarPorSobrenome(@ApiParam(value = "sobrenome do cliente.",required=true) @PathVariable("sobrenome") String sobrenome) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cliente>(objectMapper.readValue("{  \"tipo\" : \"interno\",  \"dataAtualizacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}", Cliente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> excluir(@ApiParam(value = "Id do cliente.",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

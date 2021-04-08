package io.swagger.api;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-07T05:48:22.248Z")

@Controller
public class ReadmeApiController implements ReadmeApi {

    private static final Logger log = LoggerFactory.getLogger(ReadmeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ReadmeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> readme() {
        return new ResponseEntity<String>("Esta API tem por objetivo fazer um crud para estudos de contract first com swagger",HttpStatus.OK);
    }

}

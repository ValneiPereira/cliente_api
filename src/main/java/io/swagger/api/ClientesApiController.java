package io.swagger.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.api.dao.ClienteDAO;
import io.swagger.model.Cliente;
import io.swagger.model.Clientes;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-07T05:48:22.248Z")

@Controller
public class ClientesApiController implements ClientesApi {

    private static final Logger log = LoggerFactory.getLogger(ClientesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private ClienteDAO clienteDAO;

    @org.springframework.beans.factory.annotation.Autowired
    public ClientesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.clienteDAO = new ClienteDAO();
    }

    public ResponseEntity<Clientes> consultarTodos() {
		/*String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
		    try {
		        return new ResponseEntity<Clientes>(objectMapper.readValue("\"\"", Clientes.class), HttpStatus.NOT_IMPLEMENTED);
		    } catch (IOException e) {
		        log.error("Couldn't serialize response for content type application/json", e);
		        return new ResponseEntity<Clientes>(HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		}
		
		return new ResponseEntity<Clientes>(HttpStatus.NOT_IMPLEMENTED);*/
    	ResponseEntity<Clientes> responseEntity = null;
    	try {
    		List<Cliente> clientes = clienteDAO.todos();
    		if (clientes != null) {
    			//400 NENHUM REGISTRO ENCONTRADO
    			if (clientes.size()<=0) {
					responseEntity = new ResponseEntity<Clientes>(objectMapper.readValue(objectMapper.writeValueAsString(clientes), Clientes.class), HttpStatus.NOT_FOUND);
				}else {
					//200 SUCESSO AO CONSULTAR
					responseEntity = new ResponseEntity<Clientes>(objectMapper.readValue(objectMapper.writeValueAsString(clientes),Clientes.class),HttpStatus.OK);
				}
				
			}
			
		} catch (Exception e) {
			log.error("Erro ao tentar consultar clientes");
			responseEntity = new ResponseEntity<Clientes>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	return responseEntity;
    }

}

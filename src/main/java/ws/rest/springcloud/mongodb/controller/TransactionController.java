package ws.rest.springcloud.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ws.rest.springcloud.mongodb.model.Transaction;
import ws.rest.springcloud.mongodb.serviceImpl.TransactionServiceImpl;

@RequestMapping("/rest/transact")
@RestController
public class TransactionController {

	@Autowired
	private TransactionServiceImpl transactservice;
	
	@GetMapping("/all")
	public Flux<Transaction> getAll() {
	System.out.println("::GET_ALL Transactions ::");
	return transactservice.findAllTransaction();
	}
	
	
	
}

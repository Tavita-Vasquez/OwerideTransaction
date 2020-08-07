package ws.rest.springcloud.mongodb.serviceImpl;

import reactor.core.publisher.Flux;
import ws.rest.springcloud.mongodb.model.Transaction;

public interface ITransactionService {

	Flux<Transaction> findAllTransaction();
	
	
}

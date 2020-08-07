package ws.rest.springcloud.mongodb.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import ws.rest.springcloud.mongodb.model.Transaction;
import ws.rest.springcloud.mongodb.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService {

	@Autowired
	private TransactionRepository transactionsrepository;
	
	
	@Override
	public Flux<Transaction> findAllTransaction() {
		// TODO Auto-generated method stub
		return transactionsrepository.findAll();
	}

}

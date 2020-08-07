package ws.rest.springcloud.mongodb.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import ws.rest.springcloud.mongodb.model.Transaction;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {

}

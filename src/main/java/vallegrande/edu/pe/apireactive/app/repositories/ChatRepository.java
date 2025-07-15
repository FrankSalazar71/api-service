package vallegrande.edu.pe.apireactive.app.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vallegrande.edu.pe.apireactive.app.models.entity.Chat;

public interface ChatRepository extends ReactiveMongoRepository<Chat, String> {
    Flux<Chat> findAllByOrderByCreatedAtDesc();
    Flux<Chat> findByModelAndDeletedFalse(String model);
    Mono<Chat> findByIdAndDeletedFalse(String id);
}
package vallegrande.edu.pe.apireactive.app.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "chat")
public class Chat {

    @MongoId
    private String id;

    @Field("request_content")
    private String requestContent;

    @Field("response_content")
    private String responseContent;

    @Field("model")
    private String model;

    @Field("created_at")
    private LocalDateTime createdAt;

    @Field("deleted")
    private Boolean deleted = false; // Nuevo campo para borrado lógico
}
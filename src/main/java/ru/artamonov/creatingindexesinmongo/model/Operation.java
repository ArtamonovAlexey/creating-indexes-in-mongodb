//package ru.artamonov.creatingindexesinmongo.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;
//import org.springframework.data.mongodb.core.mapping.FieldType;
//import org.springframework.data.mongodb.core.mapping.MongoId;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Document(collection = "operations")
//public class Operation {
//
//    @MongoId(FieldType.INT64)
//    private Long id;
//
//    @Indexed
//    @Field
//    private String nameOfOperation;
//
//}

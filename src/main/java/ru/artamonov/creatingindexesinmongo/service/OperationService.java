//package ru.artamonov.creatingindexesinmongo.service;
//
//import org.springframework.stereotype.Service;
//import ru.artamonov.creatingindexesinmongo.model.Operation;
//import ru.artamonov.creatingindexesinmongo.repository.OperationRepository;
//
//@Service
//public class OperationService {
//
//    private final OperationRepository operationRepository;
//
//    public OperationService(OperationRepository operationRepository) {
//        this.operationRepository = operationRepository;
//    }
//
//    public void saveOperation(Operation operation) {
//        operationRepository.save(operation);
//
//        System.out.println("Operation saved successfully");
//        System.out.println("operation : " + operation);
//    }
//
//    public void findById(Long operationId) {
//        System.out.println(operationRepository.findById(operationId));
//    }
//
//}

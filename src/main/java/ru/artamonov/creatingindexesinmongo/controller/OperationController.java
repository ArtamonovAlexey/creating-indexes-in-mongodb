//package ru.artamonov.creatingindexesinmongo.controller;
//
//import org.springframework.web.bind.annotation.*;
//import ru.artamonov.creatingindexesinmongo.model.Operation;
//import ru.artamonov.creatingindexesinmongo.service.OperationService;
//
//@RestController
//@RequestMapping("/operation")
//public class OperationController {
//
//    private final OperationService operationService;
//
//    public OperationController(OperationService operationService) {
//        this.operationService = operationService;
//    }
//
//    @PutMapping("/save")
//    public void save(@RequestBody Operation operation) {
//        System.out.println(operation);
//
//        operationService.saveOperation(operation);
//    }
//
//    @GetMapping("/get/{id}")
//    public void get(@PathVariable Long id) {
//        operationService.findById(id);
//    }
//
//}

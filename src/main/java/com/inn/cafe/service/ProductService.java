package com.inn.cafe.service;

import com.inn.cafe.POJO.Product;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface ProductService {

    ResponseEntity<String> addNewProduct(Map<String, String> requestMap);
}

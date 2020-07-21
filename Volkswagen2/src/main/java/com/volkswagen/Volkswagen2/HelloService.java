package com.volkswagen.Volkswagen2;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface HelloService {

  CompletableFuture<Map<String, Object>> sayHello(String name);

}

package com.volkswagen.Volkswagen2.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.volkswagen.Volkswagen2.HelloService;
import com.volkswagen.Volkswagen2.HelloServiceImpl;
import com.volkswagen.Volkswagen2.ThrowableMapper;
import com.volkswagen.Volkswagen2.HelloResource;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloResource.class);

    bind(ThrowableMapper.class);
  }

  @Provides
  @Singleton
  public HelloService helloService() {
    return new HelloServiceImpl();
  }

}

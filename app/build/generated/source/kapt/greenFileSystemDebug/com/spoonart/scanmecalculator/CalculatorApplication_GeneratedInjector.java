package com.spoonart.scanmecalculator;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = CalculatorApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface CalculatorApplication_GeneratedInjector {
  void injectCalculatorApplication(CalculatorApplication calculatorApplication);
}

// Generated by Dagger (https://dagger.dev).
package com.spoonart.scanmecalculator.di;

import com.spoonart.scanmecalculator.utility.TextAnalyzer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.Reusable")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideTextAnalyzerFactory implements Factory<TextAnalyzer> {
  private final AppModule module;

  public AppModule_ProvideTextAnalyzerFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public TextAnalyzer get() {
    return provideTextAnalyzer(module);
  }

  public static AppModule_ProvideTextAnalyzerFactory create(AppModule module) {
    return new AppModule_ProvideTextAnalyzerFactory(module);
  }

  public static TextAnalyzer provideTextAnalyzer(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTextAnalyzer());
  }
}

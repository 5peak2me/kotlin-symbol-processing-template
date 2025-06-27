package com.github.speak2me.ksp.template.processor

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

internal class TemplateSymbolProcessorProvider : SymbolProcessorProvider {

  override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
    return TemplateSymbolProcessor(
      codeGenerator = environment.codeGenerator,
      logger = environment.logger
    )
  }
}

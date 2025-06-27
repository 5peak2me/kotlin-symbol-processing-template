package com.github.speak2me.ksp.template.processor

import com.github.speak2me.ksp.template.Template
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration

internal class TemplateSymbolProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {
  override fun process(resolver: Resolver): List<KSAnnotated> {
    val declarations = resolver.getSymbolsWithAnnotation(Template::class.java.name)
      .filterIsInstance<KSClassDeclaration>()
      .distinct()

    if (!declarations.iterator().hasNext()) return emptyList()

    // TODO: Generate code

    return emptyList()
  }
}

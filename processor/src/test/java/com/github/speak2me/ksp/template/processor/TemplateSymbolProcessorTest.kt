package com.github.speak2me.ksp.template.processor

import com.github.speak2me.ksp.template.Template
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.symbol.KSAnnotated
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class TemplateSymbolProcessorTest {

    @Test
    fun testProcessWithoutAnnotations() {
        val codeGenerator = mock<CodeGenerator>()
        val logger = mock<KSPLogger>()
        val resolver = mock<Resolver>()

        whenever(resolver.getSymbolsWithAnnotation(Template::class.java.name)) doReturn emptySequence()

        val processor = TemplateSymbolProcessor(codeGenerator, logger)
        val result = processor.process(resolver)

        assertEquals(emptyList<KSAnnotated>(), result)
    }

    @Test
    fun testProviderCreatesProcessor() {
        val codeGenerator = mock<CodeGenerator>()
        val logger = mock<KSPLogger>()
        val environment = mock<SymbolProcessorEnvironment> {
            on { this.codeGenerator } doReturn codeGenerator
            on { this.logger } doReturn logger
        }

        val provider = TemplateSymbolProcessorProvider()
        val processor = provider.create(environment)

        assertNotNull(processor)
    }
}

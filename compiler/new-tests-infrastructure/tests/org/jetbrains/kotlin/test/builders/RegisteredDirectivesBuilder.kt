/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.builders

import org.jetbrains.kotlin.test.directives.*

class RegisteredDirectivesBuilder {
    private val simpleDirectives: MutableList<SimpleDirective> = mutableListOf()
    private val stringValueDirectives: MutableMap<StringValueDirective, List<String>> = mutableMapOf()
    private val enumValueDirectives: MutableMap<EnumValueDirective<*>, List<Enum<*>>> = mutableMapOf()
    private val valueDirectives: MutableMap<ValueDirective<*>, List<Any>> = mutableMapOf()

    operator fun SimpleDirective.unaryPlus() {
        simpleDirectives += this
    }

    infix fun StringValueDirective.with(value: String) {
        with(listOf(value))
    }

    infix fun StringValueDirective.with(values: List<String>) {
        stringValueDirectives.putWithExistsCheck(this, values)
    }

    infix fun <T : Enum<T>> EnumValueDirective<T>.with(value: T) {
        with(listOf(value))
    }

    infix fun <T : Enum<T>> EnumValueDirective<T>.with(values: List<T>) {
        enumValueDirectives.putWithExistsCheck(this, values)
    }

    infix fun <T : Any> ValueDirective<T>.with(value: T) {
        with(listOf(value))
    }

    infix fun <T : Any> ValueDirective<T>.with(values: List<T>) {
        valueDirectives.putWithExistsCheck(this, values)
    }

    private fun <K : Directive, V> MutableMap<K, V>.putWithExistsCheck(key: K, value: V) {
        val alreadyRegistered = put(key, value)
        if (alreadyRegistered != null) {
            error("Default values for $key directive already registered")
        }
    }

    fun build(): RegisteredDirectives {
        return RegisteredDirectivesImpl(simpleDirectives, stringValueDirectives, enumValueDirectives, valueDirectives)
    }
}

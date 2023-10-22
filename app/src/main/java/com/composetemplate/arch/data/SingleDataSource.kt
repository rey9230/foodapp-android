package com.composetemplate.arch.data

interface SingleDataSource<T> {
    suspend fun get(): T?
    suspend fun add(item: T)
    suspend fun clear()
}
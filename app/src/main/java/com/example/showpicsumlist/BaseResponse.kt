package com.example.showpicsumlist

abstract class BaseResponse<M> {
    abstract fun mapper(): M
}
package com.example.tkk.kotlinproject

/**
 * Created  on 2018-06-04
 * @author 唐开阔
 * @describe
 */
public class TestClass constructor(var id : Long) {
    var a = null

    constructor(a: Nothing?) : this(1) {
        this.a = a
    }
}
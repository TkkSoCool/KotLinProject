package com.example.tkk.kotlinproject
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tkk.kotlinproject.R.id.tvMes
import com.example.tkk.kotlinproject.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import java.util.Arrays.asList

/**
 * 一:基本数据类型
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        variable()
        tvMes.text = "1"
        tvMes.setOnClickListener{ v ->  Log.d("qqq", v.tag.toString()) }
    }

    /**
     * 一：变量
     *  1:变量使用var关键字命名，自动推断类型，若需要指定类型在变量名后使用【: 类型 (如var doubleVar : Double) 】
     *  2:常量使用val命名
     */
   private fun variable() {
        var ints = asList(1, 2, 3, 4)
        var intVar = 1
        val intVal = 2
        var doubleVar: Double = 5.0
        val name = "name is my"
        var intList : List<kotlin.Int> = ArrayList()
        Log.d("variable : ", name.javaClass.toString())
        keyWord("word")
        expression(3)
    }

    /**
     * 二：关键字
     *  1：in 判断一个对象是否在某一个区间
     */
    fun keyWord(word: String): String {
        val x = 3
        //是否存在区间
        if (x in 5..8) Log.d("keyWord", "x in 5..8")
        //是否在array
        val intArr: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
        if (x in intArr) Log.d("keyWord", "intArr")
        //遍历array
        for (a in intArr) {
            Log.d("in intArr", a.toString())
        }
        Log.d("variable : ", word)
        return "2"
    }

    /**
     * 表达式
     */
    fun expression(a: Int) {
        //if 表达式：会把最后一行表达式作为返回值,替代三元运算符
        val b = 5
        val max = if (a > b) a else b
        //when 表达式，相当于Java的switch
        when (a) {
            1 -> {
                Log.d("expression : ", " == 1")
                Log.d("expression : ", " == 1")
            }
            2 -> Log.d("expression : ", " == 2")
            3 -> Log.d("expression : ", " == 3")

            3,4,5 -> Log.d("expression : ", " 3 or 4 or 5")
            in 1..10 -> Log.d("expression : ", "in 1..10 ")
            !in 1..10 -> Log.d("expression : ", " not in 1..10")
            else -> {
                Log.d("expression : ", " == 没有值")
            }
        }
        //中转和继续
        loop@ for (i in 1..100) {
             return@loop
        }
        Log.d("expression : ", " == 结束")
        val a = Utils
        a.a
    }
}

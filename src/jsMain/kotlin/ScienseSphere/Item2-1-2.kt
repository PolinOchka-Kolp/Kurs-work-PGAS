package ScienseSphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.date
import common.scienceSphere
import csstype.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.h6
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.useState

external interface Item212Props : Props {
}

val Item212 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"2.1.2 Исключительное право студента на достигнутый им научный результат интеллектуальной деятельности"
    }
    ol {
        for (value in 1..scienceSphere[2]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = scienceSphere[2]!![value]!!["Дата"]!!
                        set = {
                            scienceSphere[2]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Достижение"
                        text = scienceSphere[2]!![value]!!["Достижение"]!!
                        set = {
                            scienceSphere[2]!![value]!!["Достижение"] = it
                        }
                    }
                    InputSelect {
                        title = "Вид документа"
                        values = arrayOf(
                            "Патент РФ на изобретение",
                            "Патент РФ на полезную модель",
                            "Свидетельство о гос.регистрации программы для ЭВМ"
                        )
                        text = scienceSphere[2]!![value]!!["Вид документа"]!!
                        set = {
                            scienceSphere[2]!![value]!!["Вид документа"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            scienceSphere[2]!![plus + 1] = mutableMapOf(
                "Дата" to date(), "Достижение" to "", "Вид документа" to ""
            )
            plus++
        }
    }
}
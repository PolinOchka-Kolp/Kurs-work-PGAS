package SocietySphere

import CommonComp.InputText
import common.date
import common.societySphere
import csstype.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.form
//import react.dom.html.InputType
import react.dom.html.ReactHTML.h6
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.useState

external interface Item314Props : Props {
}

val Item314 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"3.1.4 Деятельность по техническому сопровождению общественного объединения"
    }
    ol {
        for (value in 1..societySphere[4]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputText {
                        title = "Количество месяцев"
                        text = societySphere[4]!![value]!!["Количество месяцев"]!!
                        set = {
                            societySphere[4]!![value]!!["Количество месяцев"] = it
                        }
                    }
                    InputText {
                        title = "Срок деятельности"
                        text = societySphere[4]!![value]!!["Срок деятельности"]!!
                        set = {
                            societySphere[4]!![value]!!["Срок деятельности"] = it
                        }
                    }
                    InputText {
                        title = "Перечень задач"
                        text = societySphere[4]!![value]!!["Перечень задач"]!!
                        set = {
                            societySphere[4]!![value]!!["Перечень задач"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            societySphere[4]!![plus + 1] = mutableMapOf(
                "Количество месяцев" to "",
                "Срок деятельности" to "",
                "Перечень задач" to ""
            )
            plus++
        }
    }
}


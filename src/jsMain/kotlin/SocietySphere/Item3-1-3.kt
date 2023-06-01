package SocietySphere

import CommonComp.InputDate
import CommonComp.InputSelect
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

external interface Item313Props : Props {
}

val Item313 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"3.1.3 Получение гранта на выполнение социальных проектов"
    }
    ol {
        for (value in 1..societySphere[3]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = societySphere[3]!![value]!!["Дата"]!!
                        set = {
                            societySphere[3]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название гранта"
                        text = societySphere[3]!![value]!!["Название гранта"]!!
                        set = {
                            societySphere[3]!![value]!!["Название гранта"] = it
                        }
                    }
                    InputSelect {
                        title = "Вид гранта"
                        values = arrayOf(
                            "Президентские гранты",
                            "Грант Росмолодежи",
                            "Прочие гранты"
                        )
                        text = societySphere[3]!![value]!!["Вид гранта"]!!
                        set = {
                            societySphere[3]!![value]!!["Вид гранта"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            societySphere[3]!![plus + 1] = mutableMapOf(
                "Дата" to date(), "Название гранта" to "", "Вид гранта" to ""
            )
            plus++
        }
    }
}


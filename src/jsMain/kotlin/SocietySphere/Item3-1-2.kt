package SocietySphere

import CommonComp.InputDate
import CommonComp.InputSelect
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

external interface Item312Props : Props {
}

val Item312 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"3.1.2 Систематическое участие студента в деятельности правозащитного характера"
    }
    ol {
        for (value in 1..societySphere[2]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата протокола"
                        text = societySphere[2]!![value]!!["Дата протокола"]!!
                        set = {
                            societySphere[2]!![value]!!["Дата протокола"] = it
                        }
                    }
                    InputSelect {
                        title = "Орган"
                        values = arrayOf(
                            "Староста",
                            "Профорг",
                            "ФПО",
                            "УВК",
                            "Студенческие объединения",
                            "Профком студентов",
                            "Совет обучающихся",
                            "Ученый совет института",
                            "Ученый совет университета"
                        )
                        text = societySphere[2]!![value]!!["Орган"]!!
                        set = {
                            societySphere[2]!![value]!!["Орган"] = it
                        }
                    }
                    InputSelect {
                        title = "Роль"
                        values = arrayOf(
                            "Член",
                            "Заместитель председателя",
                            "Председатель",
                            "Руководитель"
                        )
                        text = societySphere[2]!![value]!!["Роль"]!!
                        set = {
                            societySphere[2]!![value]!!["Роль"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            societySphere[2]!![plus + 1] = mutableMapOf(
                "Дата протокола" to date(), "Орган" to "", "Роль" to ""
            )
            plus++
        }
    }
}


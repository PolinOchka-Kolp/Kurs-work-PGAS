package StudySphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.date
import common.studySphere
import csstype.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.form
//import react.dom.html.InputType
import react.dom.html.ReactHTML.h6
import react.dom.html.ReactHTML.label
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.useState

external interface Item12Props : Props {
}

val Item12 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"1.2 Получение студентом в течение года награды за результаты проектной деят-ти"
    }
    ol {
        for (value in 1..studySphere[2]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        text = studySphere[2]!![value]!!["Дата"]!!
                        title = "Дата"
                        set = {
                            studySphere[2]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Достижение"
                        text = studySphere[2]!![value]!!["Достижение"]!!
                        set = {
                            studySphere[2]!![value]!!["Достижение"] = it
                        }
                    }
                    InputSelect {
                        title = "Место (при наличии)"
                        values = arrayOf(
                            "1 место",
                            "2 место",
                            "3 место"
                        )
                        set = {
                            studySphere[2]!![value]!!["Место (при наличии)"] = it
                        }
                        text = studySphere[2]!![value]!!["Место (при наличии)"]!!
                    }
                    InputSelect {
                        title = "Уровень мероприятия"
                        values = arrayOf(
                            "Местный (кафедральный)",
                            "Местный (факультетский)",
                            "Местный (вузовский)",
                            "Региональный (городской)",
                            "Региональный (региональный)",
                            "Региональный (межрегиональный)",
                            "Региональный (окружной)",
                            "Ведомственный",
                            "Всероссийский",
                            "Международный"
                        )
                        set = {
                            studySphere[2]!![value]!!["Уровень мероприятия"] = it
                        }
                        text = studySphere[2]!![value]!!["Уровень мероприятия"]!!
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            studySphere[2]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Достижение" to "",
                "Место (при наличии)" to "",
                "Уровень мероприятия" to ""
            )
            plus++
        }
    }
}


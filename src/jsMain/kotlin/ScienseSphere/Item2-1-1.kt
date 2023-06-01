package ScienseSphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.date
import common.scienceSphere
import common.studySphere
import csstype.ClassName
import csstype.TextDecoration
import react.FC
import react.Props
import emotion.react.css
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.h5
import react.dom.html.ReactHTML.h6
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.dom.html.ReactHTML.p
import react.useState

external interface Item211Props : Props {
}

val Item211 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"2.1 Получение студентом:"
    }
    h6 {
        +"2.1.1 Награды за результаты научно-исследовательской работы"
    }
    ol {
        for (value in 1..scienceSphere[1]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = scienceSphere[1]!![value]!!["Дата"]!!
                        set = {
                            scienceSphere[1]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Достижение"
                        text = scienceSphere[1]!![value]!!["Достижение"]!!
                        set = {
                            scienceSphere[1]!![value]!!["Достижение"] = it
                        }
                    }
                    InputSelect {
                        title = "Место"
                        values = arrayOf(
                            "1 место",
                            "2 место",
                            "3 место",
                            "Финалист",
                            "Полуфиналист"
                        )
                        set = {
                            scienceSphere[1]!![value]!!["Место"] = it
                        }
                        text = scienceSphere[1]!![value]!!["Место"]!!
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
                            scienceSphere[1]!![value]!!["Уровень мероприятия"] = it
                        }
                        text = scienceSphere[1]!![value]!!["Уровень мероприятия"]!!
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            scienceSphere[1]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Достижение" to "",
                "Место" to "",
                "Уровень мероприятия" to ""
            )
            plus++
        }
    }
}
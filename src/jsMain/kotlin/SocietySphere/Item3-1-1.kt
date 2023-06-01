package SocietySphere

import CommonComp.*
import common.date
import common.scienceSphere
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

external interface Item311Props : Props {
}

val Item311 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"3.1.1 Систематическое участие студента в проведении мероприятий"
    }
    ol {
        for (value in 1..societySphere[1]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = societySphere[1]!![value]!!["Дата"]!!
                        set = {
                            societySphere[1]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название мероприятия"
                        text = societySphere[1]!![value]!!["Название мероприятия"]!!
                        set = {
                            societySphere[1]!![value]!!["Название мероприятия"] = it
                        }
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
                        text = societySphere[1]!![value]!!["Уровень мероприятия"]!!
                        set = {
                            societySphere[1]!![value]!!["Уровень мероприятия"] = it
                        }
                    }
                    InputCheckbox {
                        title = "Организовано в ОмГУПС"
                        this.value = societySphere[1]!![value]!!["Организовано в ОмГУПС"]!!
                        set = {
                            societySphere[1]!![value]!!["Организовано в ОмГУПС"] = it
                        }
                    }
                    InputSelect {
                        title = "Степень участия"
                        values = arrayOf(
                            "Руководитель",
                            "Организатор",
                            "Модератор",
                            "Волонтер",
                            "Исполнитель"
                        )
                        text = societySphere[1]!![value]!!["Степень участия"]!!
                        set = {
                            societySphere[1]!![value]!!["Степень участия"] = it
                        }
                    }
                    InputCheckbox {
                        title = "Мероприятие входит в список ППОС ОмГУПС"
                        this.value = societySphere[1]!![value]!!["Мероприятие входит в список ППОС ОмГУПС"]!!
                        set = {
                            societySphere[1]!![value]!!["Мероприятие входит в список ППОС ОмГУПС"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            societySphere[1]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Название мероприятия" to "",
                "Уровень мероприятия" to "",
                "Организовано в ОмГУПС" to "",
                "Степень участия" to "",
                "Мероприятие входит в список ППОС ОмГУПС" to ""
            )
            plus++
        }
    }
}


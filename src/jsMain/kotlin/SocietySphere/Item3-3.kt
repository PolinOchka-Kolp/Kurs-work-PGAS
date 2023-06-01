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
import react.dom.html.ReactHTML.h5
//import react.dom.html.InputType
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.useState

external interface Item33Props : Props {
}

val Item33 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"3.3 Участие студента в общественно-значимой деятельности, направленной на формирование у детей и молодёжи общероссийской гражданской идентичности"
    }
    ol {
        for (value in 1..societySphere[6]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = societySphere[6]!![value]!!["Дата"]!!
                        set = {
                            societySphere[6]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название мероприятия"
                        text = societySphere[6]!![value]!!["Название мероприятия"]!!
                        set = {
                            societySphere[6]!![value]!!["Название мероприятия"] = it
                        }
                    }
                    InputSelect {
                        title = "Уровень мероприятия"
                        values = arrayOf(
                            "Местный (в т.ч. вузовский)",
                            "Региональный (городской)",
                            "Региональный (региональный)",
                            "Региональный (межрегиональный)",
                            "Региональный (окружной)",
                            "Ведомственный",
                            "Всероссийский",
                            "Международный"
                        )
                        text = societySphere[6]!![value]!!["Уровень мероприятия"]!!
                        set = {
                            societySphere[6]!![value]!!["Уровень мероприятия"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            societySphere[6]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Название мероприятия" to "",
                "Уровень мероприятия" to ""
            )
            plus++
        }
    }
}


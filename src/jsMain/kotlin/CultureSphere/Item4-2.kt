package CultureSphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.cultureSphere
import common.date
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

external interface Item42Props : Props {
}

val Item42 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"4.2 Публичное представление студентом в течение года, созданного им произведения литературы или исскуства"
    }
    ol {
        for (value in 1..cultureSphere[2]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = cultureSphere[2]!![value]!!["Дата"]!!
                        set = {
                            cultureSphere[2]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название мероприятия"
                        text = cultureSphere[2]!![value]!!["Название мероприятия"]!!
                        set = {
                            cultureSphere[2]!![value]!!["Название мероприятия"] = it
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
                        text = cultureSphere[2]!![value]!!["Уровень мероприятия"]!!
                        set = {
                            cultureSphere[2]!![value]!!["Уровень мероприятия"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            cultureSphere[2]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Название мероприятия" to "",
                "Уровень мероприятия" to ""
            )
            plus++
        }
    }
}


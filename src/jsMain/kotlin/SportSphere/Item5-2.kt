package SportSphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.date
import common.sportSphere
import csstype.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.h5
import react.dom.html.ReactHTML.h6
//import react.dom.html.InputType
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.useState

external interface Item52Props : Props {
}

val Item52 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"5.2 Систематическое участие студента в спортивных мероприятиях различного характера и иных общественно значимых спортивных мероприятиях"
    }
    ol {
        for (value in 1..sportSphere[3]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = sportSphere[3]!![value]!!["Дата"]!!
                        set = {
                            sportSphere[3]!![value]!!["Дата"] = it
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
                        text = sportSphere[3]!![value]!!["Уровень мероприятия"]!!
                        set = {
                            sportSphere[3]!![value]!!["Уровень мероприятия"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            sportSphere[3]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Уровень мероприятия" to ""
            )
            plus++
        }
    }
}


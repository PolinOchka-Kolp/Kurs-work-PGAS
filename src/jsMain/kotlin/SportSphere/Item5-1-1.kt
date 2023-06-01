package SportSphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.cultureSphere
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

external interface Item511Props : Props {
}

val Item511 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"5.1.1 Получение студентом награды за результаты спортивной деятельности"
    }
    ol {
        for (value in 1..sportSphere[1]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = sportSphere[1]!![value]!!["Дата"]!!
                        set = {
                            sportSphere[1]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название мероприятия"
                        text = sportSphere[1]!![value]!!["Название мероприятия"]!!
                        set = {
                            sportSphere[1]!![value]!!["Название мероприятия"] = it
                        }
                    }
                    InputSelect {
                        title = "Уровень мероприятия"
                        values = arrayOf(
                            "Региональный",
                            "Ведомственный",
                            "Всероссийский",
                            "Международный"
                        )
                        text = sportSphere[1]!![value]!!["Уровень мероприятия"]!!
                        set = {
                            sportSphere[1]!![value]!!["Уровень мероприятия"] = it
                        }
                    }
                    InputSelect {
                        title = "Место"
                        values = arrayOf(
                            "1 место",
                            "2 место",
                            "3 место"
                        )
                        text = sportSphere[1]!![value]!!["Место"]!!
                        set = {
                            sportSphere[1]!![value]!!["Место"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            sportSphere[1]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Название мероприятия" to "",
                "Уровень мероприятия" to "",
                "Место" to ""
            )
            plus++
        }
    }
}


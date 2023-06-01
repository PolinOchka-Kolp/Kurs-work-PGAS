package CultureSphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.cultureSphere
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

external interface Item41Props : Props {
}

val Item41 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"4.1 Получение студентом в течение года, награды за результаты культурно-творческой деятельности"
    }
    ol {
        for (value in 1..cultureSphere[1]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = cultureSphere[1]!![value]!!["Дата"]!!
                        set = {
                            cultureSphere[1]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название мероприятия"
                        text = cultureSphere[1]!![value]!!["Название мероприятия"]!!
                        set = {
                            cultureSphere[1]!![value]!!["Название мероприятия"] = it
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
                        text = cultureSphere[1]!![value]!!["Уровень мероприятия"]!!
                        set = {
                            cultureSphere[1]!![value]!!["Уровень мероприятия"] = it
                        }
                    }
                    InputSelect {
                        title = "Место"
                        values = arrayOf(
                            "Гран-при",
                            "1 место",
                            "2 место",
                            "3 место",
                            "Лауреат/дипломат/призер (спец. приз)"
                        )
                        text = cultureSphere[1]!![value]!!["Место"]!!
                        set = {
                            cultureSphere[1]!![value]!!["Место"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            cultureSphere[1]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Название мероприятия" to "",
                "Уровень мероприятия" to "",
                "Место" to ""
            )
            plus++
        }
    }
}


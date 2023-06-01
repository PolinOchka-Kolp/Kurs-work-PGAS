package CultureSphere

import CommonComp.InputDate
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

external interface Item43Props : Props {
}

val Item43 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"4.3 Систематическое участие студента в проведении публичной культкрно-творческой деятельности"
    }
    ol {
        for (value in 1..cultureSphere[3]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = cultureSphere[3]!![value]!!["Дата"]!!
                        set = {
                            cultureSphere[3]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название мероприятия"
                        text = cultureSphere[3]!![value]!!["Название мероприятия"]!!
                        set = {
                            cultureSphere[3]!![value]!!["Название мероприятия"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            cultureSphere[3]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Название мероприятия" to ""
            )
            plus++
        }
    }
}


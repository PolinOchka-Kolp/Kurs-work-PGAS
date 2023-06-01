package ScienseSphere

import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.date
import common.scienceSphere
import csstype.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.h6
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.useState

external interface Item213Props : Props {
}

val Item213 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"2.1.3 Грант на выполнение научно-исследовательской работы"
    }
    ol {
        for (value in 1..scienceSphere[3]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = scienceSphere[3]!![value]!!["Дата"]!!
                        set = {
                            scienceSphere[3]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Название гранта"
                        text = scienceSphere[3]!![value]!!["Название гранта"]!!
                        set = {
                            scienceSphere[3]!![value]!!["Название гранта"] = it
                        }
                    }
                    InputSelect {
                        title = "Финансируется:"
                        values = arrayOf(
                            "Российский научный фонд",
                            "Совет по грантам Президента РФ",
                            "Фонд содействия инновациям",
                            "Иное"
                        )
                        text = scienceSphere[3]!![value]!!["Финансируется:"]!!
                        set = {
                            scienceSphere[3]!![value]!!["Финансируется:"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            scienceSphere[3]!![plus + 1] = mutableMapOf(
                "Дата" to date(), "Название гранта" to "", "Финансируется:" to ""
            )
            plus++
        }
    }
}
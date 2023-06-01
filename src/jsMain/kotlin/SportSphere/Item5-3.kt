package SportSphere

import CommonComp.InputCheckbox
import CommonComp.InputRadio
import CommonComp.InputDate
import common.date
import common.scienceSphere
import common.sportSphere
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

external interface Item53Props : Props {
}

val Item53 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"5.3 Выполнение нормативов и требований золотого знака отличия ГТО соответствующей возрастной группы"
    }
    ol {
        for (value in 1..sportSphere[4]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата получения знака ГТО"
                        text = sportSphere[4]!![value]!!["Дата получения знака ГТО"]!!
                        set = {
                            sportSphere[4]!![value]!!["Дата получения знака ГТО"] = it
                        }
                    }
                    InputCheckbox {
                        title = "Наличие золотого знака ГТО"
                        this.value = sportSphere[4]!![value]!!["Наличие золотого знака ГТО"]!!
                        set = {
                            sportSphere[4]!![value]!!["Наличие золотого знака ГТО"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            sportSphere[4]!![plus + 1] = mutableMapOf(
                "Дата получения знака ГТО" to date(),
                "Наличие золотого знака ГТО" to ""
            )
            plus++
        }
    }
}


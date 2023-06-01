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

external interface Item512Props : Props {
}

val Item512 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"5.1.2 Получение студентом спортивного разряда и звания"
    }
    ol {
        for (value in 1..sportSphere[2]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата получения разряда/звания"
                        text = sportSphere[2]!![value]!!["Дата получения разряда/звания"]!!
                        set = {
                            sportSphere[2]!![value]!!["Дата получения разряда/звания"] = it
                        }
                    }
                    InputSelect {
                        title = "Спортивный разряд/звание"
                        values = arrayOf(
                            "Заслуженный мастер спорта России (ЗМС)",
                            "Мастер спорта России международного класса (МСМК)",
                            "Мастер спорта России (МС)",
                            "1-й спортивный разряд",
                            "2-й спортивный разряд",
                            "3-й спортивный разряд"
                        )
                        text = sportSphere[2]!![value]!!["Спортивный разряд/звание"]!!
                        set = {
                            sportSphere[2]!![value]!!["Спортивный разряд/звание"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            sportSphere[2]!![plus + 1] = mutableMapOf(
                "Дата получения разряда/звания" to date(),
                "Спортивный разряд/звание" to ""
            )
            plus++
        }
    }
}


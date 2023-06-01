import CommonComp.InputDate
import CommonComp.InputSelect
import CommonComp.InputText
import common.date
import common.studySphere
import csstype.ClassName
import react.dom.html.ReactHTML
import react.FC
import react.Props
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.h6
//import react.dom.html.InputType
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.useState


external interface Item13Props : Props {
}

val Item13 = FC { _: Props ->
    var plus by useState(1)
    h6 {
        +"1.3 Признание студента победителем или призером олимпиады и тд, любого уровня"
    }
    ol {
        for (value in 1..studySphere[3]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата"
                        text = studySphere[3]!![value]!!["Дата"]!!
                        set = {
                            studySphere[3]!![value]!!["Дата"] = it
                        }
                    }
                    InputText {
                        title = "Достижение"
                        text = studySphere[3]!![value]!!["Достижение"]!!
                        set = {
                            studySphere[3]!![value]!!["Достижение"] = it
                        }
                    }
                    InputSelect {
                        title = "Место (при наличии)"
                        values = arrayOf(
                            "1 место",
                            "2 место",
                            "3 место",
                            "Золотой медалист",
                            "Серебрянный медалист",
                            "Бронзовый медалист",
                            "Победитель",
                            "Призер",
                            "Финалист",
                            "Полуфиналист"
                        )
                        text = studySphere[3]!![value]!!["Место (при наличии)"]!!
                        set = {
                            studySphere[3]!![value]!!["Место (при наличии)"] = it
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
                        set = {
                            studySphere[3]!![value]!!["Уровень мероприятия"] = it
                        }
                        text = studySphere[3]!![value]!!["Уровень мероприятия"]!!
                    }
                    InputSelect {
                        title = "Вид мероприятия"
                        values = arrayOf("Предметный", "Профильный")
                        set = {
                            studySphere[3]!![value]!!["Вид мероприятия"] = it
                        }
                        text = studySphere[3]!![value]!!["Вид мероприятия"]!!
                    }
                }
            }
        }
    }
    ReactHTML.button {
        +"✚"
        onClick = {
            studySphere[3]!![plus + 1] = mutableMapOf(
                "Дата" to date(),
                "Достижение" to "",
                "Место (при наличии)" to "",
                "Уровень мероприятия" to "",
                "Вид мероприятия" to "",
            )
            plus++
        }
    }
}
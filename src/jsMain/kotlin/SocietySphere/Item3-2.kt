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

external interface Item32Props : Props {
}

val Item32 = FC { _: Props ->
    var plus by useState(1)
    h5 {
        +"3.2 Деятельность по информационному обеспечению общественно-значимых мероприятий"
    }
    ol {
        for (value in 1..societySphere[5]!!.keys.size) {
            li {
                form {
                    className = ClassName("row")
                    InputDate {
                        title = "Дата публикации"
                        text = societySphere[5]!![value]!!["Дата публикации"]!!
                        set = {
                            societySphere[5]!![value]!!["Дата публикации"] = it
                        }
                    }
                    InputText {
                        title = "Название публикации"
                        text = societySphere[5]!![value]!!["Название публикации"]!!
                        set = {
                            societySphere[5]!![value]!!["Название публикации"] = it
                        }
                    }
                    InputSelect {
                        title = "Наличие публикации в СМИ:"
                        values = arrayOf(
                            "Университета",
                            "Региональных",
                            "Ведомственных",
                            "Федеральных"
                        )
                        title = "Название публикации"
                        text = societySphere[5]!![value]!!["Наличие публикации в СМИ:"]!!
                        set = {
                            societySphere[5]!![value]!!["Наличие публикации в СМИ:"] = it
                        }
                    }
                    InputSelect {
                        title = "Участие в разработке/администрировании сайта:"
                        values = arrayOf(
                            "Университета",
                            "Факультета"
                        )
                        text = societySphere[5]!![value]!!["Участие в разработке/администрировании сайта:"]!!
                        set = {
                            societySphere[5]!![value]!!["Участие в разработке/администрировании сайта:"] = it
                        }
                    }
                }
            }
        }
    }
    button {
        +"✚"
        onClick = {
            societySphere[5]!![plus + 1] = mutableMapOf(
                "Дата публикации" to date(),
                "Название публикации" to "",
                "Наличие публикации в СМИ:" to "",
                "Участие в разработке/администрировании сайта:" to ""
            )
            plus++
        }
    }
}


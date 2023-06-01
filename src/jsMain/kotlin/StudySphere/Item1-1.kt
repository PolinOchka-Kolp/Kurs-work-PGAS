package StudySphere

import CommonComp.InputText
import common.studySphere
import react.FC
import react.Props
//import react.dom.html.InputType
import react.dom.html.ReactHTML.h6

external interface Item11Props : Props {
    var title: String
}

val Item11 = FC { props: Item11Props ->
    h6 {
        +"1.1 Получение студентом в течение не менее двух следующих друг за другом сессий на \"отлично\""
    }
    InputText {
        title = props.title
        text = studySphere[1]!![1]!![props.title].toString()
        set = {
            studySphere[1]!![1]!![props.title] = it
        }
    }
}

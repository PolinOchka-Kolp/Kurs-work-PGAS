import StudySphere.Item11
import StudySphere.Item12
import common.Config
import common.studySphere
import csstype.*
import react.FC
import react.Props
import emotion.react.css
import react.create
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.dom.html.ReactHTML.p

val StudyCommon = FC { _: Props ->
    div {
        ol {
            studySphere.forEach {
                li { +it.value.values.toString() }
            }
        }
    }
    div {
        p {
            css {
                textAlign = TextAlign.center
                fontWeight = FontWeight.bold
                fontSize = FontSize.large
                textDecoration = TextDecoration.underline
            }
            +"Учебная деятельность"
        }
        Item11 {
            title = "Кол-во сессий на \"отлично\""
        }
        Item12 {}
        Item13 {}
    }
}
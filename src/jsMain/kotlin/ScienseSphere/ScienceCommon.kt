import ScienseSphere.*
import common.scienceSphere
import common.studySphere
import csstype.*
import react.FC
import react.Props
import emotion.react.css
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h5
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.dom.html.ReactHTML.p

val ScienceCommon = FC { _: Props ->
    div {
        ol {
            scienceSphere.forEach {
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
            +"Научно-исследовательская деятельность"
        }
        Item211 {}
        Item212 {}
        Item213 {}
        p {
            h5 {
                +"2.2 Наличие у студента публикации в научном издании"
            }
        }
        Item221{}
        Item222{}
    }
}


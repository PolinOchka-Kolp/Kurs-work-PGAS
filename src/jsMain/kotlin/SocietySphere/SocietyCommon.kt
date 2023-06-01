import ScienseSphere.*
import SocietySphere.*
import common.scienceSphere
import common.societySphere
import csstype.*
import react.FC
import react.Props
import emotion.react.css
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h5
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.dom.html.ReactHTML.p

val SocietyCommon = FC { _: Props ->
    div {
        ol {
            societySphere.forEach {
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
            +"Общественная деятельность"
        }
        h5 {
            +"3.1 Систематическое участие студента в течение года в проведении общественно-значимой деятельности"
        }
        Item311 {}
        Item312 {}
        Item313 {}
        Item314 {}
        Item32 {}
        Item33 {}
    }
}


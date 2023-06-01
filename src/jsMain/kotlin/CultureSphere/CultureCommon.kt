import CultureSphere.Item41
import CultureSphere.Item42
import CultureSphere.Item43
import ScienseSphere.*
import SocietySphere.*
import common.cultureSphere
import common.scienceSphere
import csstype.*
import react.FC
import react.Props
import emotion.react.css
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h5
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.dom.html.ReactHTML.p

val CultureCommon = FC { _: Props ->
    div {
        ol {
            cultureSphere.forEach {
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
            +"Культурно-творческая деятельность"
        }
        Item41 {}
        Item42 {}
        Item43 {}
    }
}


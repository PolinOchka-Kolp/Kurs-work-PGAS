
import SportSphere.Item511
import SportSphere.Item512
import SportSphere.Item52
import SportSphere.Item53
import common.societySphere
import common.sportSphere
import csstype.*
import react.FC
import react.Props
import emotion.react.css
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h5
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.dom.html.ReactHTML.p

val SportCommon = FC { _: Props ->
    div {
        ol {
            sportSphere.forEach {
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
            +"Спортивная деятельность"
        }
        p {
            h5 {
                +"5.1 Получение студентом в течение года награды за результаты спортивной деятельности в рамках мероприятий различного уровня, проводимых университетом или спортивными организациями"
            }
        }
        Item511 {}
        Item512 {}
        Item52 {}
        Item53 {}
    }
}


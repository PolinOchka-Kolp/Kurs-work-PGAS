package app

import CommonComp.InputText
import CultureCommon
import ScienceCommon
import SocietyCommon
import SportCommon
import StudyCommon
import common.Config
import common.jsonCreate
import common.person
import csstype.*
import react.FC
import react.Props
import emotion.react.css
import org.w3c.dom.url.URL
import org.w3c.files.Blob
import org.w3c.files.BlobPropertyBag
import react.create
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.dom.html.ReactHTML.p
import react.router.Route
import react.router.Routes
import react.router.dom.HashRouter
import react.router.dom.Link
import react.useRef
import react.dom.html.ReactHTML.a
import web.html.HTMLAnchorElement

val CMenu = FC("Menu") { _: Props ->
    div {
        css {
            display = Display.grid
        }
        Link {
            +"1. Учебная деятельность"
            to = Config.studyPath
        }
        Link {
            +"2. Научно-исследовательская деятельность"
            to = Config.sciencePath
        }
        Link {
            +"3. Общественная деятельность"
            to = Config.societyPath
        }
        Link {
            +"4. Культурно-творческая деятельность"
            to = Config.culturePath
        }
        Link {
            +"5. Спортивная деятельность"
            to = Config.sportPath
        }
    }
}

val App = FC { _: Props ->
    div {
        className = ClassName("container")
        ol {
            li {
                div {
                    p {
                        css {
                            textAlign = TextAlign.center
                            fontWeight = FontWeight.bold
                        }
                        +"Заявление"
                    }
                    p {
                        css {
                            textAlign = TextAlign.center
                        }
                        +"Прошу рассмотреть мою кандидатуру на получение повышенной государственной академической степендии. Копию зачетной книжки, копии грамот и документов, подтерждающих соответствие соответствующим критериям прилагаются и перечислены в таблице."
                    }
                }
            }
        }
        person.forEach { (key, value) ->
            InputText {
                title = key
                text = value
                set = {
                    person[key] = it
                }
            }
        }
        val linkRef = useRef<HTMLAnchorElement>()
        a {
            +"Скачать"
            ref = linkRef
        }
        button {
            +" Сохранить"
            onClick = {
                val blob = Blob(arrayOf(jsonCreate()), BlobPropertyBag("text/plain"))
                val url = URL.createObjectURL(blob)
                linkRef.current!!.href = url
                linkRef.current!!.download = "file.json"
            }
        }
        HashRouter {
            CMenu()
            Routes {
                Route {
                    path = Config.studyPath
                    element = StudyCommon.create()
                }
                Route {
                    path = Config.sciencePath
                    element = ScienceCommon.create()
                }
                Route {
                    path = Config.societyPath
                    element = SocietyCommon.create()
                }
                Route {
                    path = Config.culturePath
                    element = CultureCommon.create()
                }
                Route {
                    path = Config.sportPath
                    element = SportCommon.create()
                }
            }
        }
    }
}
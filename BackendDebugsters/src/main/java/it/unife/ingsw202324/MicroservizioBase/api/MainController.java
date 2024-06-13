package it.unife.ingsw202324.MicroservizioBase.api;

import it.unife.ingsw202324.MicroservizioBase.services.TemplateRestConsumer;
import it.unife.ingsw202324.MicroservizioBase.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController /* Annotation per definire che la classe risponderà tramite rest  */
@RequestMapping("/api") /* Annotation per definire il path della classe  */
public class MainController {

    @Autowired
    VideoService videoservice;

    @RequestMapping("/videoTrailer")
    public String getVideoUrl() {
        //restituisce il video trailer corrispondente all'id-1 indicato nel get (es: id=1->get(0), id=2->get(1))
        return videoservice.getselected().get(0);
    }

    //restituisce la pagina in cui fare il sondaggio pre-evento
    @RequestMapping("/sondaggioPre")
    public RedirectView sondaggioPre() {
        RedirectView sondaggioPre = new RedirectView();
        sondaggioPre.setUrl("https://www.survio.com/survey/d/O4R2I8F9P9G7V2T5V");
        return sondaggioPre;
    }

    //restituisce la pagina in cui fare il sondaggio post-evento
    @RequestMapping("/sondaggioPost")
    public RedirectView sondaggioPost() {
        RedirectView sondaggioPost = new RedirectView();
        sondaggioPost.setUrl("https://www.survio.com/survey/d/C8Q2G1A8U1L0F8H2A");
        return sondaggioPost;
    }

    /* Lista di tutte le chiamate a Mockoon utilizzando REST */

    @RequestMapping("/callRESTdatiEvento")
    public String callRestDatiEvento() {
        return TemplateRestConsumer.callREST("datiEvento", null, true);
    }

    @RequestMapping("/callRESTiscrizione")
    public String callRestIscrizione() {
        return TemplateRestConsumer.callREST("iscrizione", null, true);
    }

    @RequestMapping("/callRESTfiltri")
    public String callRestFiltri() {
        return TemplateRestConsumer.callREST("filtri", null, true);
    }

    @RequestMapping("/callRESTprofiloUtente")
    public String callRestProfiloUtente() {
        return TemplateRestConsumer.callREST("profiloUtente", null, true);
    }

    @RequestMapping("/callRESTmappe")
    public String callRestMappe() {
        return TemplateRestConsumer.callREST("mappe", null, true);
    }

    @RequestMapping("/callRESTorgprofilo")
    public String callRestProfiloOrg() {
        return TemplateRestConsumer.callREST("orgProfilo", null, true);
    }

    @RequestMapping("/callRESTbiglietteria")
    public String callRestBiglietteria() {
        return TemplateRestConsumer.callREST("biglietteria", null, true);
    }

    @RequestMapping("/callRESTchat")
    public String callRestChat() {
        return TemplateRestConsumer.callREST("chat", null, true);
    }

    @RequestMapping("/callRESTlive")
    public String callRestLive() {
        return TemplateRestConsumer.callREST("live", null, true);
    }

    @RequestMapping("/callRESTrecensioni")
    public String callRestRecensioni() {
        return TemplateRestConsumer.callREST("recensioni", null, true);
    }

    @RequestMapping("/callRESThomepage")
    public String callRestHomePage() {
        return TemplateRestConsumer.callREST("homepage", null, true);
    }

    @RequestMapping("/callRESTfaq")
    public String callRestFaq() {
        return TemplateRestConsumer.callREST("faq", null, true);
    }

    @RequestMapping("/callRESTsponsor")
    public String callRestSponsor() {
        return TemplateRestConsumer.callREST("sponsor", null, true);
    }

    @RequestMapping("/callRESTsupportoUtente")
    public String callRestSupportoUtente() {
        return TemplateRestConsumer.callREST("supportoUtente", null, true);
    }

    @RequestMapping("/callRESTsupportoTecnico")
    public String callRestSupportoTecnico() {
        return TemplateRestConsumer.callREST("supportoTecnico", null, true);
    }

    @RequestMapping("/callRESTsegnalaEvento")
    public String callRestSegnalaEvento() {
        return TemplateRestConsumer.callREST("segnalaEvento", null, true);
    }

}

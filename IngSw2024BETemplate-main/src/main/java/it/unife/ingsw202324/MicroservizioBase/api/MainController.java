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
        //restituisce il video trailer corrispondente all'id indicato nel get
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

    @RequestMapping("/callRESTeventonome") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestEventoNome() {
        return TemplateRestConsumer.callREST("nomeEventi", null, true);
    }

    @RequestMapping("/callRESTdataora") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestDataOra() {
        return TemplateRestConsumer.callREST("dataOra", null, true);
    }

    @RequestMapping("/callRESTluogo") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestLuogo() {
        return TemplateRestConsumer.callREST("luogo", null, true);
    }

    @RequestMapping("/callRESTmappe") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestMappe() {
        return TemplateRestConsumer.callREST("mappe", null, true);
    }

    @RequestMapping("/callRESTinformazioni") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestInformazioni() {
        return TemplateRestConsumer.callREST("informazioni", null, true);
    }

    @RequestMapping("/callRESTprezzi") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestPrezzi() {
        return TemplateRestConsumer.callREST("prezzi", null, true);
    }

    @RequestMapping("/callRESTbiglietteria") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestBiglietteria() {
        return TemplateRestConsumer.callREST("biglietteria", null, true);
    }

    @RequestMapping("/callRESTsponsor") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestSponsor() {
        return TemplateRestConsumer.callREST("sponsor", null, true);
    }

    @RequestMapping("/callRESTrecensioni") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestRecensioni() {
        return TemplateRestConsumer.callREST("recensioni", null, true);
    }

    @RequestMapping("/callRESTsupportoutente") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestSupportoUtente() {
        return TemplateRestConsumer.callREST("supportoUtente", null, true);
    }

    @RequestMapping("/callRESTsupportotecnico") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestSupportoTecnico() {
        return TemplateRestConsumer.callREST("supportoTecnico", null, true);
    }

    @RequestMapping("/callRESTcategorie") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestCategorie() {
        return TemplateRestConsumer.callREST("categorie", null, true);
    }

    @RequestMapping("/callRESTfiltri") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestFiltri() {
        return TemplateRestConsumer.callREST("filtri", null, true);
    }

    @RequestMapping("/callRESTorganizzatoreprofilo") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestOrganizzatoreProfilo() {
        return TemplateRestConsumer.callREST("profiloOrganizzatore", null, true);
    }

    @RequestMapping("/callRESTchat") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestChat() {
        return TemplateRestConsumer.callREST("chat", null, true);
    }

    @RequestMapping("/callRESTlive") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestLive() {
        return TemplateRestConsumer.callREST("live", null, true);
    }

    @RequestMapping("/callRESTprofiloutente") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestProfiloUtente() {
        return TemplateRestConsumer.callREST("profiloUtente", null, true);
    }

    @RequestMapping("/callRESTlogin") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestLogin() {
        return TemplateRestConsumer.callREST("login", null, true);
    }

    @RequestMapping("/callRESTfaq") /* Annotation per definire il path del metodo (relativo alla classe)  */
    public String callRestFaq() {
        return TemplateRestConsumer.callREST("faq", null, true);
    }
    
}

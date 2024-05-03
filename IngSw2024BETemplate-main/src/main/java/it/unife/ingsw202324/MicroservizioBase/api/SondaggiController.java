package it.unife.ingsw202324.MicroservizioBase.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api")
class SondaggiController {

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
}
package it.unife.ingsw202324.MicroservizioBase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api")
class SondaggioController {

    @RequestMapping("/sondaggioPre")
    public RedirectView sondaggioPre() {
        RedirectView sondaggioPre = new RedirectView();
        sondaggioPre.setUrl("https://www.survio.com/survey/d/O4R2I8F9P9G7V2T5V");
        return sondaggioPre;
    }

    @RequestMapping("/sondaggioPost")
    public RedirectView sondaggioPost() {
        RedirectView sondaggioPost = new RedirectView();
        sondaggioPost.setUrl("https://www.survio.com/survey/d/O2K6F3U7I4U8Y4P9O");
        return sondaggioPost;
    }
}
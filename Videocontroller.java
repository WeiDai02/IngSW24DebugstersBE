package it.unife.ingsw202324.MicroservizioBase.api;


import it.unife.ingsw202324.MicroservizioBase.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/video")
public class Videocontroller {

    @Autowired
    VideoService videoservice;

    @RequestMapping("/getvideo")
    public String getVideoUrl() {
        //restituisce la colonna indicata nel get
        return videoservice.getselected().get(1);

    }
}

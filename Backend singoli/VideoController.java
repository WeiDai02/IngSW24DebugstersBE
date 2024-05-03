package it.unife.ingsw202324.MicroservizioBase.api;


import it.unife.ingsw202324.MicroservizioBase.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class VideoController {

    @Autowired
    VideoService videoservice;

    @RequestMapping("/videoTrailer")
    public String getVideoUrl() {
        //restituisce il video trailer corrispondente all'id indicato nel get
        return videoservice.getselected().get(1);

    }
}

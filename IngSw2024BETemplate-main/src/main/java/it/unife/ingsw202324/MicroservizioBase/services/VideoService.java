package it.unife.ingsw202324.MicroservizioBase.services;

import it.unife.ingsw202324.MicroservizioBase.models.VideoTable;
import it.unife.ingsw202324.MicroservizioBase.repositories.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private MyRepository myRepository;

    public List<VideoTable> getfirst() {

        return myRepository.findAll();
    }

    public List<String> getselected() {
        return myRepository.getselected();


    }
}

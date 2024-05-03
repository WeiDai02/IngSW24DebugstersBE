package it.unife.ingsw202324.MicroservizioBase.repositories;




import it.unife.ingsw202324.MicroservizioBase.models.videotable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Myrepository2 extends JpaRepository<videotable, Long> {
    @Query(value = "SELECT urlvideo FROM videotable" ,nativeQuery = true)
    List<String> getselected();

}

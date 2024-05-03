package it.unife.ingsw202324.MicroservizioBase.repositories;




import it.unife.ingsw202324.MicroservizioBase.models.VideoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MyRepository2 extends JpaRepository<VideoTable, Long> {
    @Query(value = "SELECT urlvideo FROM VideoTable" ,nativeQuery = true)
    List<String> getselected();

}

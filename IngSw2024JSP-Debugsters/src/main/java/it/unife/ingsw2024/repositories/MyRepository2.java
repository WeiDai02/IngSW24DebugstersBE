package it.unife.ingsw2024.repositories;




import it.unife.ingsw2024.models.VideoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MyRepository2 extends JpaRepository<VideoTable, Long> {
    @Query(value = "SELECT urlvideo FROM VideoTable" ,nativeQuery = true)
    List<String> getselected();

}

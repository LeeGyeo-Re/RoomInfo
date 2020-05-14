package hotelmanage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface RoomInfoRepository extends PagingAndSortingRepository<RoomInfo, Integer>{


}

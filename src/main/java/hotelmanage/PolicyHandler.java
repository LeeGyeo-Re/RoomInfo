package hotelmanage;

import hotelmanage.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @Autowired
//    @Qualifier("room")
    RoomInfoRepository roomInfoRepository;

    @Autowired
//    @Qualifier("product")
    ProductRepository productRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSave_RoomInfo(@Payload RoomConditionChanged roomConditionChanged){

        if(roomConditionChanged.isMe()){
            System.out.println("##### listener 객실정보저장 : " + roomConditionChanged.toJson());
                RoomInfo roomInfo = new RoomInfo();
                roomInfo.setRoomNumber(roomConditionChanged.getRoomNumber());
                roomInfo.setRoomStatus(roomConditionChanged.getRoomStatus());
                roomInfoRepository.save(roomInfo);

        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSave_Product(@Payload ProductAdded productAdded){

        if(productAdded.isMe()){
            System.out.println("##### listener 상품정보저장 : " + productAdded.toJson());
            Product product = new Product();
            product.setProductCnt(productAdded.getProductCnt());
            product.setProductId(productAdded.getProductId());
            product.setProductName(productAdded.getProductName());
            productRepository.save(product);

        }
    }


}

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class LogModel {
    String statusCode;
    String ip;
    String path;
    LocalDateTime date;
}

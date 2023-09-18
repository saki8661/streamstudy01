package shop.mtcoding.streamstudy.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private Integer id;
    private String title;
    private String content;
    private String author;

}

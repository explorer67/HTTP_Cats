import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class CatFact {
    private final String id; //уникальный идентификатор записи
    private final String text; //text - сообщение
    private final String type; //тип животного
    private final String user; // имя пользователя
    private final int upvotes; // количество голосов

    public CatFact (
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString(){
        return
                "id: " + id +
                        "\n text: " +  text +
                        "\n type: " + type +
                        "\n user: " + user +
                        "\n upvotes: " + upvotes +
                "\n";

    }
}
